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
 * 用户评论
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {

    /**
     * 评论的主键id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 类型。1为文章，2为友链，3为说说????
     */
    private Integer commentType;

    /**
     * 类型ID
     */
    private Integer typeId;

    /**
     * 父评论的ID
     */
    private Integer parentId;

    /**
     * 回复评论的ID
     */
    private Integer replyId;

    /**
     * 评论的所属用户id
     */
    private Integer fromUid;

    /**
     * 评论的内容
     */
    private String commentContent;

    /**
     * 回复评论的用户ID
     */
    private Integer toUid;


    /**
     * 是否通过。0为否，1为是
     */
    private Integer isCheck;

    /**
     * 评论的时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     *  更新评论的时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;


}
