package cn.cooper.uestc.domain;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BorrowingTableDo {
    /**
     * 
     */
    private Long id;

    /**
     * 学生学号
     */
    private Long studentsId;

    /**
     * 
     */
    private String studentsName;

    /**
     * 借阅的书籍的具体信息包括书籍名
     */
    private String borrowBookName;

    /**
     * 对应与这本被借书籍的具体编号
     */
    private String borrowBookSerialnumber;

    /**
     * 应还日期
     */
    private Date returnDate;

    /**
     * 实际归还日期
     */
    private Date acturalReturnDate;

    /**
     * 借阅日期
     */
    private Date borrowingDate;
}