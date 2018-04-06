package cn.wmw.learn.aspect;

import cn.wmw.learn.enums.ExceptionEnum;
import cn.wmw.learn.exception.CommonException;
import cn.wmw.learn.to.resp.RestResponse;
import cn.wmw.learn.util.LogUtil;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * Created by mingwei on 18-3-25
 */
@Slf4j
@Aspect
@Component
public class ControllerAspect {

    @Pointcut(value = "execution(public * cn.wmw.learn.controller..*.*(..))")
    public void doSomething() {};

    @Around("doSomething()")
    public Object handle (ProceedingJoinPoint joinPoint) throws Throwable {
        String controllerName = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = ((MethodSignature) joinPoint.getSignature()).getMethod().getName();

        // 输入日志
        log.info("[Controller({})] {}, input=[{}]",
                controllerName, methodName, LogUtil.buildLogFromArgs((joinPoint.getArgs())));

        Object result;
        try {
            result = joinPoint.proceed();

            log.info("[Controller({})] {}, output=[{}]",
                    controllerName, methodName, JSON.toJSONString(result));

        } catch (CommonException e) {
            log.info("[Controller({})] {}, throw exception code={} message={}",
                    controllerName, methodName, e.getCode(), e.getMessage());
            return RestResponse.error(e.getCode(), e.getMessage());
        } catch (Exception e) {
            log.info("[Controller({})] {}, throw unmatchable exception message={}",
                    controllerName, methodName, e.getMessage());
            return RestResponse.serverError(ExceptionEnum.SERVER_ERROR.getMessage());
        }

        return result;
    }
}
