package cn.wmw.learn.to.resp;

import lombok.Data;

/**
 * Created by mingwei on 18-3-18
 */
@Data
public class BooleanResp {
    private boolean success;
    private String message;

    public BooleanResp(boolean success) {
        this.success = success;
    }

    public BooleanResp(boolean success, String message) {
        this.success = success;
        this.message = message;
    }
}
