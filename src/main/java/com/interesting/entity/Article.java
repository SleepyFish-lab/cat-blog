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
 * 文章的实体类
 */
@Builder    //提供
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Article {

    /**
     * Article ID
     */
    //    表示如果这个字段没有主动设置，则默认设置为表中的最大id+1
    //    没有指定type时是使用雪花算法进行赋值
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 文章作者ID
     */
    private Integer userId;

    /**
     * 文章分类ID
     */
    private Integer categoryId;

    /**
     * 文章缩略图的文件路径
     */
    private String articleCover;

    /**
     * 文章的标题
     */
    private String articleTitle;

    /**
     * 文章的内容
     */
    private String articleContent;

    /**
     * 文章的类型。1为原创文章，2为转载文章，3为翻译文章
     */
    private Integer articleType;

    /**
     * 是否置顶。 0为否，1为是
     */
    private Integer isTop;

    /**
     * 是否已经被删除，逻辑删除。0为否，1为是
     */
    private Integer isDelete;

    /**
     * 是否进行推荐。0为否，1为是
     */
    private Integer isRecommend;

    /**
     * 文章的状态。1为公开，2为私密，3为草稿
     */
    private Integer status;

    /**
     * 文章的发布时间
     */
    //mybatis-plus提供的字段自动填充，当要插入记录的时候，会自动填充new Data();
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 文章的更新时间
     */
    //mybatis-plus提供的字段自动填充，当要插入或更新记录的时候，会自动填充new Data();
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;
}
