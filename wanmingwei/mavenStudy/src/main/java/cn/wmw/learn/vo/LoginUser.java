package cn.wmw.learn.vo;

import cn.wmw.learn.domain.UserDO;
import lombok.Data;

/**
 * Created by mingwei on 18-3-25
 */
@Data
public class LoginUser {
    private String username;
    private int userId;

    public static LoginUser fromUserDO(UserDO userDO) {
        if (userDO == null) {
            return null;
        }

        LoginUser loginUser = new LoginUser();
        loginUser.setUsername(userDO.getUserName());
//        这里看看国伟的Ｉｄ是什么作用
        loginUser.setUserId(userDO.getUserId());
        return loginUser;
    }
}
