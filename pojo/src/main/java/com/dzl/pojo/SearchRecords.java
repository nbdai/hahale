package com.dzl.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class SearchRecords {
    @Id
    private String id;
    private String content;
}
