package com.dzl.login.controller;

import com.dzl.dao.user.UserReposity;
import com.dzl.pojo.Users;
import com.dzl.utils.JSONResult;
import com.dzl.utils.MD5Utils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(value = "用户登陆的接口",tags = {"登陆的Controller"})
public class LoginController {
    @Autowired
    private UserReposity userReposity;
    @ApiOperation(value = "登陆",notes = "登陆接口")
    @PostMapping("/login")
    public  JSONResult  login(@RequestBody Users users) throws Exception {
        String username = users.getUsername();
        String password = users.getPassword();
        //判断是否为空
       if(StringUtils.isBlank(username)||StringUtils.isBlank(password)){
           return JSONResult.ok("用户名密码不能为空");
       }
        //判断用户是否存在，
        List<Users> usersList = userReposity.findByUsernameAndPassword(username, MD5Utils.getMD5Str(password));
        Users retUsers = null;
        //返回.
        if(usersList.size()!=0){
            retUsers  = usersList.get(0);
            retUsers.setPassword("");
            return  JSONResult.ok(retUsers);
        }else {
            return  JSONResult.errorMsg("用户名密码不匹配");
        }
    }
}
