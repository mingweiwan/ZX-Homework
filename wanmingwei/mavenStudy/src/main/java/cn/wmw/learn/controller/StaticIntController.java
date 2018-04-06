package cn.wmw.learn.controller;

import cn.wmw.learn.service.StaticInt;
import cn.wmw.learn.service.impl.StaticIntImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mingwei on 18-4-1
 * 多用户同时操作　同一个变量
 */
@RestController
public class StaticIntController {
    @RequestMapping(value = "/change", method = RequestMethod.GET)
    public int changeStaticInt() {
        StaticInt staticInt = new StaticIntImpl();
        staticInt.change();
        return StaticIntImpl.anInt;
    }
}
