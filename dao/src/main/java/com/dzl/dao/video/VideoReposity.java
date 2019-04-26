package com.dzl.dao.video;

import com.dzl.pojo.Videos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoReposity  extends JpaRepository<Videos,String> {
}
