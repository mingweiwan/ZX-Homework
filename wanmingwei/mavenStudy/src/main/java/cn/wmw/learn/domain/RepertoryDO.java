package cn.wmw.learn.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RepertoryDO {
    /**
     * 仓库ＩＤ
     */
    private Integer repId;

    /**
     * 书籍编号
     */
    private Integer number;

    /**
     * 所有数量
     */
    private Integer allAmount;

    /**
     * 现在数量
     */
    private Integer nowAmount;
}