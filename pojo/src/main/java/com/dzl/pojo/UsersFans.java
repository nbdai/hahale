package com.dzl.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class UsersFans {
    @Id
    private String id;
    private String userId;
    private  String fanId;

}
