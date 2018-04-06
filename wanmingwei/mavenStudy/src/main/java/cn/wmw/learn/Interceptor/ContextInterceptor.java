package cn.wmw.learn.Interceptor;

import cn.wmw.learn.vo.LoginContext;
import cn.wmw.learn.vo.WebContext;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by mingwei on 18-4-1
 */

public class ContextInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
                             Object handler) throws Exception {

        WebContext.request.set(request);
        WebContext.response.set(response);

        HttpSession session = request.getSession();

        String isLoggedIn = (String) session.getAttribute("isLoggedIn");
//SpringMVC框架能保证在cookie值相同的情况下每次得到的session对象是同一个对象
// 这里每次进来都要设置LoginContext是有原因的
// 这里注意 不只是第二次访问要set 第三次访问第四次访问每次都要set  原因在于，
// 一个请求对于一个线程。第一次访问和第二次访问是两个线程，唯一的关联之处是session对象是一样的，
// 而LoginContext是 ThreadLocal类型的，意思是些类型的属性是被线程独有，自然第三次访问他还是要set这些属性。
// 不set就是空的
        if (isLoggedIn != null) { //如果之前就登录过的
            LoginContext.username.set((String) session.getAttribute("username"));
            LoginContext.userId.set((Integer) session.getAttribute("userId"));
        }

        return true;
    }
}
