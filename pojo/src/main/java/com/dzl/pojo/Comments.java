package com.dzl.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Data
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
