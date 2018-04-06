package cn.wmw.learn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Arrays;

/**
 * Created by mingwei on 18-4-1
 * 区分不同线程的变量的例子
 */
@RestController
public class StaticIntThread {
    public static ThreadLocal<StringBuilder> str = new ThreadLocal<>();

    public static int count = 0;
    public static StringBuilder sb = new StringBuilder();

    @RequestMapping(value = "/GW")
    public String showIndex() {
        str.set(new StringBuilder());
        count++;
        str.get().append(count).append(" ");
        sb.append(count).append(" ");
        return "threadLocal: " + str.get().toString() +
                "</br>Common: " + sb.toString() +
                "</br>当前线程: " + Thread.currentThread().getName();
    }

    @RequestMapping(value = "/session")
    public String showIndex(HttpSession session, HttpServletRequest request) {
        count ++;
        if (session.getAttribute("name") == null) {
            session.setAttribute("name", "用户名字" + count);
        }

        return  (String) session.getAttribute("name")
                + "</br> 当前线程: "+ Thread.currentThread().getName()
                + "</br> 请求次数" + count;
    }
}
