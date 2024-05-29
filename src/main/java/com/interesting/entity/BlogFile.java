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
 * 文件
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BlogFile {

    /**
     * 文件ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 文件的URL???
     */
    private String fileUrl;

    /**
     * 文件的名称
     */
    private String fileName;

    /**
     * 文件的大小
     */
    private Integer fileSize;

    /**
     * 文件的扩展名
     */
    private String extendName;

    /**
     * 文件的路径???
     */
    private String filePath;


    /**
     * 是否为目录。0为否，1为是
     */
    private Integer isDir;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;
}

