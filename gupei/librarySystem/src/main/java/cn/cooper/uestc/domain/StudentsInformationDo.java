package cn.cooper.uestc.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StudentsInformationDo {
    /**
     * 确定该表中各个记录(主键自增)
     */
    private Long id;

    /**
     * 学生的学号
     */
    private Long studentsId;

    /**
     * 学生姓名
     */
    private String studentsName;

    /**
     * 学院信息
     */
    private String institute;

    /**
     * 有的话状态表示有，默认是无
     */
    private String borrowStatus;

    /**
     * 还能借几本书
     */
    private Integer limitbooks;
}