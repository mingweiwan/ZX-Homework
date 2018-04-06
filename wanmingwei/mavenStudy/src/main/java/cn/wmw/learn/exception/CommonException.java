package cn.wmw.learn.exception;

/**
 * Created by mingwei on 18-3-25
 */
public class CommonException extends Exception{
    private int code;

    private CommonException(int code, String message) {
        super(message);
        this.code = code;
    }

    public static CommonException create(int code, String message) {
        return new CommonException(code, message);
    }

    public int getCode() {
        return code;
    }
}
