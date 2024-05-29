package com.interesting.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.interesting.entity.Article;
import com.interesting.model.vo.query.ArticleQuery;
import com.interesting.model.vo.request.ArticleReq;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ArticleMapper extends BaseMapper<Article> {


    /**
     * 根据关键字等信息，查询后台文章数量
     *
     * @param articleQuery 文章的查询条件
     * @return 文章数量
     */
    Long selectBackArticleCount(@Param("param") ArticleQuery articleQuery);


    /**
     * 查询后台文章列表
     *
     * @param articleQuery  文章查询条件
     * @return  后台文章列表
     */
    List<ArticleBackResp> selectBackArticleList(@Param("param") ArticleQuery articleQuery);

}
