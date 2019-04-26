package com.dzl.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Data
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
@Entity
public class Comments {
    @Id
    private  String id;
    private String fatherCommentId;
    private  String toUserId;
    private String videoId;
    private String fromUserId;
    private  String comment;
    private Date createTime;

}
