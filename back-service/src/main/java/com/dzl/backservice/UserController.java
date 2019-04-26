package com.dzl.backservice;

import com.dzl.pojo.Users;
import com.dzl.pojo.UsersFans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("updateUser")
    public  boolean  updateUser(@RequestBody Users users){
        return userService.updataUserInfo(users);
    }
    @RequestMapping("findById/{userId}")
    public Users findById(@PathVariable("userId") String userId){
        return userService.findById(userId);
    }
    @RequestMapping("queryIfFollow")
    public boolean queryIfFollow(@RequestBody UsersFans usersFans){
        return userService.queryIfFollow(usersFans.getUserId(),usersFans.getFanId());
    }
}
