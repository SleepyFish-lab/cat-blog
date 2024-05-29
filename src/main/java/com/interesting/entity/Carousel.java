package com.interesting.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.core.style.StylerUtils;

import java.time.LocalDateTime;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Carousel {

    /**
     * 轮播图的id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 轮播图的地址
     */
    private String imgUrl;

    /**
     * 是否显示。0为否，1为是
     */
    private Integer status;


    /**
     * 备注
     */
    private String remark;

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
