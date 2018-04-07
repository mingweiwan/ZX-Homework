package cn.cooper.uestc.To.RequestFromClient;


import cn.cooper.uestc.enums.SexEnum;
import lombok.Data;

/**
 * By GuPei 18-3-18
 */
    //使用枚举的目的在于，前后端传输虽然可以用字符串格式进行传输，但是枚举是用int类型进行传输，这样是更节省
    //性能的，int类型消耗性能更小，出于对硬件的考虑使用枚举。枚举是一个特殊的类表示只具有特定的实例，枚举类
    //外的类不能调用这个枚举类的构造方法。因为他的实例是在枚举类中已经确定好了的，但是方法可以进行调用。
@Data
public class UserRegisterReq {
    private String username;
    private Long  StudentsId;
    private int sexCode;
    private SexEnum sex;
    private String password;
    private String name;
    private String institute;

    public void setSexEnum(int sexCode) {
        this.sexCode = sexCode;
        this.sex = SexEnum.fromCode(sexCode);
    }

}
