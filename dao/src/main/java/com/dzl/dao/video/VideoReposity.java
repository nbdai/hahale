package com.dzl.dao.video;

import com.dzl.pojo.Videos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface VideoReposity  extends JpaRepository<Videos,String> ,JpaSpecificationExecutor<Videos>{
    @Transactional
    @Modifying
    @Query("update Videos as videos set videos.coverPath = ?1 where videos.id=?2")
    int updateCoverPathById(String coverPath , String id);
}
