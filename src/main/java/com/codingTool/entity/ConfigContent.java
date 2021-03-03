package com.codingTool.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @description: config json
 * @author: uaike
 * @create: 2020-12-07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConfigContent {


    private Long id;

    private String code;

    private String value;

    private String status;

    private Date createTime;

    private Date modifiedTime;
}
