package com.dzl.dao.userfans;

import com.dzl.pojo.UsersFans;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserFanRepositry extends JpaRepository<UsersFans,String>{
    List<UsersFans> findUsersFansByUserIdAndFanId(String  userId,String fanId);
}
