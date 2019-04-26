package com.dzl.backservice;

import com.dzl.dao.userfans.UserFanRepositry;
import com.dzl.dao.user.UserReposity;
import com.dzl.pojo.Users;
import com.dzl.pojo.UsersFans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserReposity userReposity;
    @Autowired
    private UserFanRepositry userFanRepositry;
    public  boolean updataUserInfo(Users user){
       return userReposity.updateFaceImageById(user.getFaceImage(),user.getId())==0?false:true;
    }
    public Users findById(String userId){
        return userReposity.getOne(userId);
    }
    public boolean queryIfFollow(String userId, String fanId) {


        List<UsersFans> list = userFanRepositry.findUsersFansByUserIdAndFanId(userId,fanId);

        if (list != null && !list.isEmpty() && list.size() > 0) {
            return true;
        }

        return false;
    }
}
