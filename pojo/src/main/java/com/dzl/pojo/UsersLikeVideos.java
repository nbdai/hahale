package com.dzl.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class UsersLikeVideos {
    @Id
    private  String  id;
    private  String userId;
    private  String videoId;

}
