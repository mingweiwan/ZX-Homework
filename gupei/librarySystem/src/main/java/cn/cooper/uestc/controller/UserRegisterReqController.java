package cn.cooper.uestc.controller;


import cn.cooper.uestc.service.UserRegisterReqService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * By GuPei 18-3-18
 */
@RestController
@Slf4j
public class UserRegisterReqController {
    private UserRegisterReqService userRegisterService;
    private static int a = 1;
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public int plusPlus() {
       return a++;

    }
}
