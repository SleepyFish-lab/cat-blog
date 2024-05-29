package com.interesting.model.vo.response;

import lombok.Data;

@Data
public class ArticleBackResp {


    /**
     * 文章ID
     */
    private Integer id;


    /**
     * 文章缩略图
     */
    private String articleCover;

    /**
     * 文章类型。1为原创，2为转载，3为翻译
     */
    private Integer articleType;
}
