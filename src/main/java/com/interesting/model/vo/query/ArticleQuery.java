package com.interesting.model.vo.query;

import lombok.Data;

@Data
public class ArticleQuery extends PageQuery {

    /**
     * 搜索内容
     */
    private String keyword;

    /**
     * 分类ID
     */
    private Integer categoryId;

    /**
     * 标签ID
     */
    private Integer tagId;

    /**
     * 是否删除。0为否，1为是
     */
    private Integer isDelete;


    /**
     * 文章状态。1为公开，2为私密，3为草稿
     */
    private Integer status;


    /**
     * 文章类型。1为原创，2为转载，3为翻译
     */
    private Integer articleType;


}
