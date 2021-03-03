package com.codingTool.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @description:
 * @author: uaike
 * @create: 2020-12-04
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    private Long id;

    private String userId;

    private String name;

    private String passWord;

    private String mobile;

    private String email;

    private String adress;

    private String gender;

    private String headImg;

    private String userType;

    private String userStatus;

    private Date createTime;

    private Date modifiedTime;
}
