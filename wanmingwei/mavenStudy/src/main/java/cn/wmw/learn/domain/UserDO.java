package cn.wmw.learn.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDO {
    /**
     * 用户ＩＤ
     */
    private Integer userId;

    /**
     * 密码
     */
    private String userPw;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户电话
     */
    private String userTel;

    /**
     * 是否管理员
     */
    private Integer isAdmin;
}