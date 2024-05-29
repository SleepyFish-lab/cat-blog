package com.interesting.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDateTime;

/**
 * 用于记录异常的日志
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionLog {

    /**
     * 异常日志的ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;


    /**
     * 异常的模块位置
     */
    private String module;

    /**
     * 异常的uri
     */
    private String uri;

    /**
     * 异常的名称
     */
    private String name;

    /**
     * 异常的方法
     */
    private String errorMethod;

    /**
     * 操作描述
     */
    private String description;

    /**
     * 异常信息
     */
    private String message;

    /**
     * 请求参数
     */
    //用于在转换为JSON时忽略这个字段
    @JsonIgnore
    private String params;

    /**
     * 请求的方法
     */
    private String requestMethod;

    /**
     *  操作的IP
     */
    private String ipAddress;

    /**
     * 操作的地址
     */
    private String ipSource;

    /**
     *  操作系统类型
     */
    private String os;

    /**
     * 浏览器类型
     */
    private String browser;

    /**
     * 操作时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;
}
