package com.dzl.login.controller;

import com.dzl.dao.user.UserReposity;

import com.dzl.pojo.Users;
import com.dzl.utils.JSONResult;
import com.dzl.utils.MD5Utils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang3.StringUtils;

import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "用户注册的接口",tags = {"注册的controller"})
public class RegistController {
    @Autowired
    private  UserReposity userReposity;
    //注入生成全局id的实体类 。
    @Autowired
    private Sid  sid;
    //注册
    @ApiOperation(value = "用户注册",notes = "接口")
    @PostMapping("/regist")
    public JSONResult regist(@RequestBody Users users) throws Exception {
        //用户名密码为空.
    if(StringUtils.isBlank(users.getUsername())||StringUtils.isBlank(users.getPassword())){
        return JSONResult.errorMsg("用户名或者密码为空");
    }
        //用户名重复，
     if(userReposity.findByUsername(users.getUsername())!=null){
        return JSONResult.errorMsg("用户名重复");
     }
        //保存用户注册信息
        String id = sid.nextShort();
        users.setId(id);
        users.setNickname(users.getUsername());
        users.setPassword(MD5Utils.getMD5Str(users.getPassword()));
        userReposity.save(users);
        return JSONResult.ok();
    }
}
