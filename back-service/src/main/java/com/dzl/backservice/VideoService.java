package com.dzl.backservice;
import com.dzl.pojo.Videos;
import com.dzl.dao.video.VideoReposity;
import org.springframework.beans.factory.annotation.Autowired;

<<<<<<< HEAD
=======
import com.dzl.dao.video.VideoReposity;
import com.dzl.pojo.Videos;
import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> mac
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class VideoService {
    @Autowired
    private VideoReposity videoReposity;
    @Transactional(propagation = Propagation.REQUIRED)
<<<<<<< HEAD
    public String saveVideo(Videos videos) {
        Videos video = videoReposity.save(videos);
        return video.getId();
    }
    @Transactional(propagation = Propagation.REQUIRED)
    public Integer updateVideo(String videoId, String uploadPathDB) {
        return videoReposity.updateCoverPathById(uploadPathDB, videoId);
    }
=======
>>>>>>> mac
    public String saveVideo(Videos videos){
       Videos video =  videoReposity.save(videos);
        return video.getId();
    }
    @Transactional(propagation = Propagation.REQUIRED)
   public Integer  updateVideo(String videoId, String uploadPathDB){
     return videoReposity.updateCoverPathById(uploadPathDB,videoId);
   }
<<<<<<< HEAD
=======


>>>>>>> mac
}
