package com.beyourself.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class CourseInfo {
    @TableId(type = IdType.AUTO)
    private Long id;
    private String courseId;
    private String courseName;
    private String Introduction;
}
