package com.dzl.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class Videos {
    @Id
    private String id;
    private String userId;
    private  String audioId;
    private  String videoDesc;
    private  String  videoPath;
    private  Float  videoSeconds;
    private  Integer  videoWidth;
    private  Integer  videoHeight;
    private  String coverPath;
    private  Long likeCounts;
    private  Integer status;
    private String videoScore;
    private String videoLimit;
    private String videoKind;
    private Date createTime;
}
