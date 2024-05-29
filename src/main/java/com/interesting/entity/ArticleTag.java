package com.interesting.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 文章标签
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticleTag {

    /**
     * 主键ID，设置为自增
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 关联的文章ID
     */
    private Integer articleId;

    /**
     * 标签ID
     */
    private Integer tagId;


}
