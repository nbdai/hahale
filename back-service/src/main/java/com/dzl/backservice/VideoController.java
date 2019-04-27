package com.dzl.backservice;

import com.dzl.pojo.Videos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoController {
    @Autowired
    private  VideoService videoService;
    @RequestMapping("saveVideo")
    public String saveVideo(@RequestBody Videos videos){
<<<<<<< HEAD
<<<<<<< HEAD
        return videoService.saveVide(videos);
=======
=======
>>>>>>> mac
        return videoService.saveVideo(videos);
    }
    @RequestMapping("updateVideo")
    public Integer  updateVideo(@RequestBody Videos videos){
      return videoService.updateVideo(videos.getId(),videos.getCoverPath());
<<<<<<< HEAD
>>>>>>> mac
=======
>>>>>>> mac
    }
}
