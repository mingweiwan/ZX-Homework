package cn.wmw.learn.vo;

/**
 * Created by mingwei on 18-4-1
 */
public class StaticIntContext {
    public static ThreadLocal<Integer> anInt = new ThreadLocal<>();
}
