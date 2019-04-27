package com.dzl.dao.user;

import com.dzl.pojo.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface UserReposity extends JpaRepository<Users,String>{
   List<Users> findByUsername(String userName);
   List<Users> findByUsernameAndPassword(String userName,String  password);
   @Transactional
   @Modifying
   @Query("update Users as user set user.faceImage = ?1 where user.id=?2")
   int updateFaceImageById(String faceImage , String id);

}
