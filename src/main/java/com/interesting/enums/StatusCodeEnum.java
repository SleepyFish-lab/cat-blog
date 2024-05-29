package com.interesting.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StatusCodeEnum {
    SUCCESS(200, "操作成功"),
    VALID_ERROR(400, "参数错误"),
    UNAUTHORIZED(402, "未登录"),
    SYSTEM_ERROR(-1, "系统异常"),
    FAIL(500, "操作失败");

    /**
     * 状态码
     */
    private final Integer code;

    /**
     * 返回信息
     */
    private final String msg;
}
