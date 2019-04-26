package com.dzl.backservice;


import com.dzl.pojo.Videos;

import com.dzl.dao.video.VideoReposity;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class VideoService {

    @Autowired
    private VideoReposity videoReposity;
    public String saveVide(Videos videos){
       Videos video =  videoReposity.save(videos);
        return video.getId();
    }
}
