package cn.cooper.uestc.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RepositoryTableDo {
    /**
     * 
     */
    private Long id;

    /**
     * 书籍编号信息，编号信息中含有位置信息
     */
    private String serialNumber;

    /**
     * 书名
     */
    private String bookName;

    /**
     * 同一本书的现存数量
     */
    private Integer number;
}