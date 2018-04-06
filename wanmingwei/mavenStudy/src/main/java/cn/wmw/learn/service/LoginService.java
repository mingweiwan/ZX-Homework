package cn.wmw.learn.service;

import cn.wmw.learn.to.req.LoginReq;
import cn.wmw.learn.vo.LoginUser;

/**
 * Created by mingwei on 18-3-25
 */
public interface LoginService {
    LoginUser login(LoginReq loginReq);

    void logout();
}
