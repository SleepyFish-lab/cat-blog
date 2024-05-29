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
 * 聊天记录
 */
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChatRecord {

    /**
     * 聊天记录的ID
     */
//  @TableId(value = "id", type = IdType.AUTO)
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 用户的ID
     */
    private Integer userId;

    /**
     * 用户昵称
     */
    private String nickName;

    /**
     * 用户头像
     */
    private String avatar;


    /**
     * 聊天内容
     */
    private String content;


    /**
     * 用户登录的IP
     */
    private String ipAddress;

    /**
     *  ip来源
     */
    private String ipSource;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;
}
