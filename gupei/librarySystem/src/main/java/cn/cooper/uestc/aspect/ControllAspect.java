package cn.cooper.uestc.aspect;


import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

import org.springframework.stereotype.Component;

/**
 * By GuPei 18-3-25
 */
//此类是切片包Aspect下的一个典型的Aspect类
@Slf4j
@Aspect
@Component
public class ControllAspect {
    //execution是执行的意思此关键字后面具体带上匹配的内容，括号里的public 表示返回类型
    // *表示返回类型，此处是指所有的类型皆可。..表示用于包的结构中，表示所有uestc的所有子包
    //..后面的这个*代表所有的类然后再后面的*代表这个类下面的所有方法。
    //一个.表示当前目录。参数括号中的两个点代表任意参数，这是execution自己设立的。
    @Pointcut(value = "execution(public * cn.cooper.uestc..*.*(..))")
    public void doSomething() {
        //Ponintcut表示切入点，doSomething()此处宛如一个标识符号，标识我们要被插入模板代码的
        //的那些方法。
    }
    //@after @before此类注解表示模板代码插入到被插入方法的具体位置
    //一般是用Around注解，此注解达到的效果是将被插入的方法作为一个对象参数传入我们的模板代码的方法
    //我们可以在任意时刻调用被插入模板代码的方法，Around注解括号中的参数对应我们上面的标识符。
    @Around("doSomething()")
    //此为模板代码方法，ProceedingJoinPoint为被切片方法的类型，此时被切片方法作为一个
    //对象传入，形参joinPoint调用proceed()方法便是启动了被切片的方法。
    public Object handle(ProceedingJoinPoint joinPoint) throws Throwable {
        joinPoint.proceed();
        Object result="abc";//Object类型是对象类型不包括原始的几种类型.
        return result;
    }
}
