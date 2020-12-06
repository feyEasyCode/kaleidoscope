package com.codingTool.controller;

import com.codingTool.dao.ToolsMapper;
import com.codingTool.entity.Tools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @description:
 * @author: zhangzhaofei
 * @create: 2020-12-06
 */
@RequestMapping(name = "/tools")
@RestController
public class ToolsController {

    @Autowired
    private ToolsMapper toolsMapper;

    @PostMapping("/create")
    public String createTool(){

        Tools tool = new Tools();
        tool.setName("测试date");
        tool.setAliseName("时间格式转换工具");
        tool.setType("转换");
        tool.setTag("转换、时间");
        tool.setCreateTime(new Date());
        tool.setModifiedTime(new Date());

        toolsMapper.insert(tool);

        return null;
    }
}
