package cn.wmw.learn.vo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by mingwei on 18-3-25
 */
public class WebContext {
//    ThreadLocal并不是一个Thread　而是线程局部变量值
//    功能是为每一个使用该变量的线程提供一个变量值的副本
//    是java中一种特殊线程绑定机制，是每个线程都可以独立地改变自己的副本
//    而不会和其它线程的副本冲突
    public static ThreadLocal<HttpServletResponse> response = new ThreadLocal<>();

    public static ThreadLocal<HttpServletRequest> request = new ThreadLocal<>();
}
