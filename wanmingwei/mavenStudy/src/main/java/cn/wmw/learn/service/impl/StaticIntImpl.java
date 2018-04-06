package cn.wmw.learn.service.impl;

import cn.wmw.learn.service.StaticInt;

/**
 * Created by mingwei on 18-4-1
 */
public class StaticIntImpl implements StaticInt {
    public static int anInt = 1;
    @Override
    public void change() {
        anInt ++;
    }
}
