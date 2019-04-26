package com.dzl.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Data
@Entity
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class UsersReport {
    @Id
    private  String id;
    private  String dealUserId;
    private  String dealVideoId;
    private  String title;
    private  String content;
    private  String  userId;
    private  Date datetime;
}
