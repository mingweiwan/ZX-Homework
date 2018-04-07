package cn.cooper.uestc.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PasswordTableDo {
    /**
     * 
     */
    private Integer id;

    /**
     * "学生学号"
     */
    private Long studentsId;

    /**
     * "学生密码"
     */
    private String password;
}