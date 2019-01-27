package com.dzl.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@ApiModel(value = "用户对象",description = "这是用户对象")
public class Users {
    @Id
    @ApiModelProperty(hidden = true)
    private  String id;
    @ApiModelProperty(value = "用户名",name = "username",example = "dzlup",required = true)
    private String username;
    private  String password;
    private  String faceImage;
    private  String nickname;
    private  Integer fansCounts;
    private Integer followCounts;
    private Integer receiveLikeCounts;
}
