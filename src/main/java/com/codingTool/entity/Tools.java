package com.codingTool.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @description:
 * @author: uaike
 * @create: 2020-12-02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tools{

    private Long id;

    private String name;

    private String aliseName;

    private String description;

    private String tag;

    private String type;

    private Date createTime;

    private Date modifiedTime;
}
