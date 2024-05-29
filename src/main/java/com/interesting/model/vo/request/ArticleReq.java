package com.interesting.model.vo.request;

import com.interesting.entity.Tag;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ArticleReq {

    /**
     * 文章的内容
     */
    String articleContent;

    /**
     * 文章的缩略图
     */
    String articleCover;

    /**
     * 文章标题
     */
    String articleTitle;

    /**
     * 文章类型。1为原创，2为转载，3为翻译
     */
    Integer articleType;

    /**
     * 分类名
     */
    String categoryName;

    /**
     * 文章的ID
     */
    Integer id;

    /**
     * 是否推荐。0为否，1为是
     */
    Integer isRecommend;

    /**
     * 是否置顶。0为否，1为是
     */
    Integer isTop;


    /**
     * 状态。1为公开，2为私密，3为草稿
     */
    Integer status;

    /**
     * 标签名的集合
     */
    ArrayList<String> tagNameList;
}
