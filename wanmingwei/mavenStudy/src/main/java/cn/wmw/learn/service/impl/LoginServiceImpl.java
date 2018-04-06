package cn.wmw.learn.service.impl;

import cn.wmw.learn.domain.UserDO;
import cn.wmw.learn.domain.condition.UserCondition;
import cn.wmw.learn.mapper.UserMapper;
import cn.wmw.learn.service.LoginService;
import cn.wmw.learn.to.req.LoginReq;
import cn.wmw.learn.vo.LoginUser;
import cn.wmw.learn.vo.WebContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceContext;
import java.util.List;

/**
 * Created by mingwei on 18-3-25
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    private UserMapper userMapper;

    public LoginUser login(LoginReq loginReq) {
       UserCondition condition = new UserCondition();
        condition.createCriteria()
                .andUserNameEqualTo(loginReq.getUsername())
                .andUserPwEqualTo(loginReq.getPassport());

        List<UserDO> userDOList = userMapper.selectByExample(condition);

        if (userDOList.size() == 0) {
            return null;
        }
//ＬｏｇｉｎＵｓｅｒ获得登录用户的　Ｉｄ　和　Ｎａｍｅ
        LoginUser loginUser = LoginUser.fromUserDO(userDOList.get(0));
//        获得通过用户cookie来获得的session
        HttpSession session = WebContext.request.get().getSession();
//        设置用户第一次登录的session
        session.setAttribute("isLoggedIn", "true");
        session.setAttribute("username", loginUser.getUsername());
        session.setAttribute("userId", loginUser.getUserId());
        return loginUser;
    }

    public void logout() {
        HttpSession session = WebContext.request.get().getSession();
        session.removeAttribute("isLoggedIn");
    }
}