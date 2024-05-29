package com.interesting.model.vo;

import lombok.Data;

import static com.interesting.enums.StatusCodeEnum.FAIL;
import static com.interesting.enums.StatusCodeEnum.SUCCESS;

@Data
public class Result<T> {

    /**
     * 状态码
     */
    private Integer code;
    /**
     * 返回信息
     */
    private String msg;

    /**
     * 响应数据
     */
    private T data;

    /**
     * 返回状态
     */
    private boolean flag;

    /**
     * 返回结果类的构造方法
     */
    private static <T> Result<T> newResult(Integer code, String msg, T data, Boolean flag) {
        Result<T> res = new Result<>();
        res.setCode(code);
        res.setMsg(msg);
        res.setData(data);
        res.setFlag(flag);
        return res;
    }

    /**
     * 响应成功，不携带数据
     */
    public static <T> Result<T> success() {
        return newResult(SUCCESS.getCode(), SUCCESS.getMsg(), null, true);
    }

    /**
     * 响应成功，并携带数据
     */
    public static <T> Result<T> success(T data) {
        return newResult(SUCCESS.getCode(), SUCCESS.getMsg(), data, true);
    }

    /**
     * 响应失败，并携带错误信息
     */
    public static <T> Result<T> fail(String msg) {
        return newResult(FAIL.getCode(), msg, null, false);
    }

    /**
     * 响应失败，并返回对应的状态码和错误信息
     */
    public static <T> Result<T> fail(Integer code, String msg) {
        return newResult(code, msg, null, false);
    }

}
