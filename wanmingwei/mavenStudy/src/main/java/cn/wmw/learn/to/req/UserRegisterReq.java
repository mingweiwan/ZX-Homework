package cn.wmw.learn.to.req;

import lombok.Data;

/**
 * Created by mingwei on 18-3-18
 */
@Data
public class UserRegisterReq {
//    属性设置为私有，保护作用，类外面只能听过ｇｅｔ　ｓｅｔ来访问到这些私有属性
    private String username;
    private String password;
    private String user_tel;
}
