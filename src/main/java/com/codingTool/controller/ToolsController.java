package com.codingTool.controller;

import com.codingTool.entity.Tools;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @description:
 * @author: uaike
 * @create: 2020-12-06
 */
@Slf4j
@RestController
@RequestMapping("/data")
public class ToolsController {

//    @Autowired
//    private ToolsMapper toolsMapper;

    @GetMapping("/create")
    public String createTool(){

        Tools tool = new Tools();
        tool.setName("测试date");
        tool.setAliseName("时间格式转换工具");
        tool.setType("转换");
        tool.setTag("转换、时间");
        tool.setCreateTime(new Date());
        tool.setModifiedTime(new Date());

//        toolsMapper.insert(tool);

        return null;
    }
}
