package cn.cooper.uestc.To.RequestFromClient;


import lombok.Data;
//TO包里面放的是传输对象，即我们从前端收到的对象和我们返回给前端的对象
/**
 * By GuPei 18-1-26
 */
@Data
//VO表示的是值对象，不是前端传过来的@requestBody部分，前端传过来的应该放在To(传输对象)包里面
//VO包里的VO对象是给我们后端自己用的，既不是从前端来也不返回给前端，也不是插入数据库的对象
//Data注解帮助对属性进行set,get方法，并且也重写好了toString()方法。
public class GetAllBookReq {
    Long id;
    String name;
    String author;
    String intro;
    String catalogue;

}
