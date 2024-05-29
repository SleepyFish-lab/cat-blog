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
 * 菜单
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Menu {

    /**
     * 菜单ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 父菜单的ID
     */
    private Integer parentId;

    /**
     * 类型。M为目录，C为菜单，B为按钮
     */
    private String menuType;

    /**
     * 名称
     */
    private String menuName;

    /**
     * 路由地址
     */
    private String path;

    /**
     * 菜单图标
     */
    private String icon;

    /**
     * 菜单组件？？？
     */
    private String component;

    /**
     *  权限标识
     */
    private String perms;

    /**
     * 是否隐藏. 0为否,1为是
     */
    private Integer isHidden;


    /**
     * 是否禁用. 0为否,1为是
     */
    private Integer isDisable;

    /**
     *  排序???
     */
    private Integer orderNum;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;

}
