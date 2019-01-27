package com.dzl.dao.user;

import com.dzl.pojo.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserReposity extends JpaRepository<Users,String>{
   List<Users> findByUsername(String userName);


}
