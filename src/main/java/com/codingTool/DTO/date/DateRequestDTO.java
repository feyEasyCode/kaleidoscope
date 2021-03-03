package com.codingTool.DTO.date;

import lombok.Data;

import java.util.Calendar;

/**
 * @description:
 * @author: uaike
 * @create: 2021-03-02
 */
@Data
public class DateRequestDTO {

    private String dateParam;

    private Integer days;

    private Integer hour;

    private Integer minute;

    private Integer second;

}
