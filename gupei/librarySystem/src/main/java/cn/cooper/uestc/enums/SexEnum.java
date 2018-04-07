package cn.cooper.uestc.enums;


/**
 * By GuPei 18-3-18
 */
public enum SexEnum {
    //0这个数字表示是男，1这个数字表示是女，MALE和FEMALE是这个枚举类的实例对象，可认为是作为
    //静态变量存在。在其他类中若想使用这个MALE对象使用SexEnum.MALE形式即可。
    MALE(0, "男"), FEMALE(1, "女"),;

    private int code;
    private String sex;

    SexEnum(int code, String sex) {
        this.code = code;
        this.sex = sex;

    }

    public int getCode() {
        return code;
    }

    public String getSex() {
        return sex;
    }

    public static SexEnum fromCode(int code) {
        //枚举的静态values方法可以得到这个枚举的所有实例
        for (SexEnum sexEnum : SexEnum.values()) {
            if (sexEnum.code == code) {
                return sexEnum;
            }
        }
        return null;
    }
}
