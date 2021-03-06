package com.codingTool.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsAutoIncrement;
import com.gitee.sunchenbin.mybatis.actable.annotation.IsKey;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
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
@Table(name = "users")
public class Customer {

    @IsAutoIncrement   //自增
    @IsKey             //actable主键注解
    @Column(comment = "用户ID")//对应数据库字段，不配置name会直接采用属性名作为字段名comment是注解
    private Long id;

    @Column(name = "user_id", comment = "用户USER ID")
    private String userId;

    @Column(comment = "昵称")
    private String name;

    @Column(name = "pass_word", comment = "用户密码")
    private String passWord;

    @Column(comment = "手机号")
    private String mobile;

    @Column(comment = "邮箱")
    private String email;

    @Column(comment = "地址")
    private String adress;

    @Column(comment = "性别")
    private String gender;

    @Column(name = "head_img", comment = "用户头像")
    private String headImg;

    @Column(name = "user_type", comment = "用户类型")
    private String userType;

    @Column(name = "user_status", comment = "账号状态")
    private String userStatus;

    @Column(name = "create_time", comment = "创建时间")
    private Date createTime;

    @Column(name = "modified_time", comment = "修改时间")
    private Date modifiedTime;
}
