package cn.wmw.learn.domain;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BorrowDO {
    /**
     * 借阅ＩＤ
     */
    private Integer borId;

    /**
     * 用户ＩＤ
     */
    private Integer userId;

    /**
     * 书籍编号
     */
    private Integer number;

    /**
     * 借阅数量
     */
    private Integer borAmount;

    /**
     * 借阅时间
     */
    private Date borDate;

    /**
     * 借书期限
     */
    private Integer borTime;

    /**
     * 
     */
    private Date borReturn;
}