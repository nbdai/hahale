package com.dzl.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class Bgm {
    @Id
    private String id;
    private String author;
    private String name;
    private String path;
}
