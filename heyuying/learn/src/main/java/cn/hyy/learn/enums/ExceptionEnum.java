package cn.hyy.learn.enums;

import cn.hyy.learn.exception.CommonException;

/**
 * Created by heyuying on 18-3-18
 */
public enum ExceptionEnum {
    //用户相关异常
    USER_EXIST(10010, "用户已存在"),
    USER_PHONE_EXIST(10101,"当前手机号已被注册"),

    //服务器异常
    SERVER_ERROR(10500,"服务器发生异常")
    ;


    private int code;
    private String message;
    private CommonException exception;

    ExceptionEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public CommonException getException() {
        if (exception == null) {
            exception = CommonException.create(code,message);
        }
        return exception;
    }
}
