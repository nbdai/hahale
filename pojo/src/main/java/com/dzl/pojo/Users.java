package com.dzl.pojo;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@ApiModel(value = "用户对象",description = "这是用户对象")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class Users {
    @Id
    @ApiModelProperty(hidden = true)
    private  String id;
    @ApiModelProperty(value = "用户名",name = "username",example = "dzlup",required = true)
    private String username;
    @ApiModelProperty(value = "密码",name = "password",example = "123456",required = true)
    private  String password;
    @ApiModelProperty(hidden = true)
    private  String faceImage;
    @ApiModelProperty(hidden = true)
    private  String nickname;
    @ApiModelProperty(hidden = true)
    private  Integer fansCounts;
    @ApiModelProperty(hidden = true)
    private Integer followCounts;
    @ApiModelProperty(hidden = true)
    private Integer receiveLikeCounts;
}
