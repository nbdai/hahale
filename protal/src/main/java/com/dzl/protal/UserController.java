package com.dzl.protal;
import com.dzl.pojo.UserInfo;
import com.dzl.pojo.Users;
import com.dzl.pojo.UsersFans;
import com.dzl.utils.JSONResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

@RestController
@RequestMapping("/user")
@Api(value = "用户相关的业务接口",tags = {"用户相关的Controller"})
public class UserController {
    @Autowired
    private RestTemplate restTemplate;
    @ApiOperation(value = "用户上传头像",notes ="用户上传头像的接口" )
    @ApiImplicitParam(name = "userId",value = "用户id",required = true,dataType ="String",paramType = "query")
    @RequestMapping("/upload")
    public JSONResult upload(String userId , @RequestParam("file") MultipartFile[] files)throws  Exception{
         String nameSpace = "F:/videos_dev";
         String nameDB = "/"+userId+"/face";
         FileOutputStream fis = null;
         InputStream is = null;
         try{
             if(files!=null&&files.length>0){
                 String fileName = files[0].getOriginalFilename();
                 if(StringUtils.isNotBlank(fileName)){
                     String fianlFileName = nameSpace+nameDB+"/"+fileName;
                     nameDB += ("/" + fileName);
                     File file = new File(fianlFileName);
                     if(file.getParentFile()!=null&&!file.getParentFile().isDirectory()){
                        //创建父文件夹
                         file.getParentFile().mkdirs();
                     }
                     fis = new FileOutputStream(file);
                     is = files[0].getInputStream();
                     //
                     IOUtils.copy(is,fis);
                 }

             }else {
                 return JSONResult.errorMsg("上传错误");
             }
         }catch (Exception e){
            e.printStackTrace();
            return  JSONResult.errorMsg("上传错误");
         }finally {
             if(fis!=null){
                 fis.flush();
                 fis.close();
             }
         }
         Users user = new Users();
         user.setId(userId);
         user.setFaceImage(nameDB);
         restTemplate.postForObject("http://localhost:8082/updateUser",user,Boolean.class);
         return JSONResult.ok(nameDB);
    }
    @ApiOperation(value="查询用户信息", notes="查询用户信息的接口")
    @ApiImplicitParam(name="userId", value="用户id", required=true,
            dataType="String", paramType="query")
    @RequestMapping("/query")
    public JSONResult query(String userId, String fanId) throws Exception {

        if (StringUtils.isBlank(userId)) {
            return JSONResult.errorMsg("用户id不能为空...");
        }
       UsersFans usersFans = new UsersFans();
        usersFans.setFanId(fanId);
        usersFans.setUserId(userId);
        Users users = restTemplate.getForObject("http://localhost:8082/findById/"+userId,Users.class);
        UserInfo userInfo = new UserInfo();
        BeanUtils.copyProperties(users, userInfo);
       boolean flag =  restTemplate.postForObject("http://localhost:8082/queryIfFollow",usersFans,Boolean.class);
        userInfo.setFollow(flag);
        return JSONResult.ok(userInfo);
    }

}
