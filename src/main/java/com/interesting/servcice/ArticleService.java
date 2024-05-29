package com.interesting.servcice;

import cn.dev33.satoken.stp.StpUtil;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.interesting.constant.RedisConstant;
import com.interesting.entity.Article;
import com.interesting.entity.SiteConfig;
import com.interesting.mapper.ArticleMapper;
import com.interesting.model.vo.request.ArticleReq;
import com.interesting.utils.BeanCopyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ArticleService extends ServiceImpl<ArticleMapper, Article> {


    @Autowired
    private RedisService redisService;



    @Transactional(rollbackFor = Exception.class)
    public Integer saveArticleCategory(ArticleReq article){

        return 0;
    }


    @Transactional(rollbackFor = Exception.class)
    public void addArticle(ArticleReq article) {

        //保存文章分类，文章可能有新的分类，需要添加到分类表里面去
        Integer categoryId = saveArticleCategory(article);

        //添加文章，将ArticleReq转换为Article
        Article newArticle = BeanCopyUtils.copyBean(article,Article.class);
        //文章缩略图不是必须的，添加article时，设置一个默认的
        if (StringUtils.isBlank(newArticle.getArticleCover())){
            SiteConfig siteConfig = redisService.getObject(RedisConstant.SITE_SETTING);
            newArticle.setArticleCover(siteConfig.getArticleCover());
        }
        newArticle.setCategoryId(categoryId);
        newArticle.setUserId(StpUtil.getLoginIdAsInt());
        baseMapper.insert(newArticle);

        //保存文章标签
        saveArticleTag(article,newArticle.getId());

    }

    private void saveArticleTag(ArticleReq article, Integer id) {

        //删除文章标签
        articleMapper
    }
}
