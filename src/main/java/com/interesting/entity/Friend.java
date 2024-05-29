package com.interesting.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 友链
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Friend {
    /**
     * 友链的ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 友链的名称
     */
    private String name;

    /**
     * 友链的颜色
     */
    private String color;

    /**
     * 友链的头像
     */
    private String avatar;

    /**
     * 友链的地址
     */
    private String url;

    /**
     * 友链介绍
     */
    private String introduction;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;
}

