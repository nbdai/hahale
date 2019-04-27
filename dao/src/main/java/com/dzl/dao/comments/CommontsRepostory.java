package com.dzl.dao.comments;

import com.dzl.pojo.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommontsRepostory extends JpaRepository<Comments,String> {
}
