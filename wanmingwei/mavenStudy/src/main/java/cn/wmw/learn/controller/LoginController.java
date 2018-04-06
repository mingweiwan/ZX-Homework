package cn.wmw.learn.controller;

import cn.wmw.learn.exception.CommonException;
import cn.wmw.learn.service.LoginService;
import cn.wmw.learn.service.impl.LoginServiceImpl;
import cn.wmw.learn.to.req.LoginReq;
import cn.wmw.learn.to.resp.RestResponse;
import cn.wmw.learn.vo.LoginUser;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by mingwei on 18-4-1
 */
@RestController
public class LoginController {
    @Resource
    private LoginService loginService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    throws CommonException   登录如何抛出异常还没了解
//    login 空指针异常　运行时错误
    public LoginUser login(@RequestBody LoginReq req) {
//        return RestResponse.ok(loginService.login(req.getUsername(), req.getPassport()));
        return loginService.login(req);
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public RestResponse logout() {
        loginService.logout();
        return RestResponse.ok();
    }
}
