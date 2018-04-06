package cn.wmw.learn.vo;

/**
 * Created by mingwei on 18-4-1
 */
public class LoginContext {

    public static ThreadLocal<String> username = new ThreadLocal<>();

    public static ThreadLocal<Integer> userId = new ThreadLocal<>();
}
