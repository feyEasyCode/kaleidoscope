package com.codingTool.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsAutoIncrement;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsKey;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
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
@Table(name = "configcontent")
public class ConfigContent {

    @TableId(type = IdType.AUTO)//mybatis-plus主键注解
    @IsAutoIncrement   //自增
    @IsKey             //actable主键注解
    @Column(comment = "message id")//对应数据库字段，不配置name会直接采用属性名作为字段名comment是注解
    private Long id;

    @Column(comment = "message key")
    private String code;

    @Column(comment = "message value")
    private String value;

    @Column(comment = "message status")
    private String status;

    @Column(comment = "创建时间")
    private Date createTime;

    @Column(comment = "修改时间")
    private Date modifiedTime;
}
