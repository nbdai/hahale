package com.dzl.backservice;

<<<<<<< HEAD
import com.dzl.pojo.Videos;
=======
import com.dzl.dao.video.VideoReposity;
import com.dzl.pojo.Videos;
import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> mac
import org.springframework.stereotype.Service;

@Service
public class VideoService {
<<<<<<< HEAD

    public  String saveVideo(Videos videos){

    }
=======
    @Autowired
    private VideoReposity videoReposity;
    public String saveVide(Videos videos){
       Videos video =  videoReposity.save(videos);
        return video.getId();
    }

>>>>>>> mac
}
