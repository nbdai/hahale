package com.dzl.login.controller;

import com.dzl.utils.JSONResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "用户注销的接口",tags = {"注销的Controller"})
public class LoginOutController {
    @ApiOperation(value="用户注销", notes="用户注销的接口")
    @ApiImplicitParam(name="userId", value="用户id", required=true,
            dataType="String", paramType="query")
    @PostMapping("/logout")
    public JSONResult logout(String userId) throws Exception {
       // redis.del(USER_REDIS_SESSION + ":" + userId);
        return JSONResult.ok();
    }
}
