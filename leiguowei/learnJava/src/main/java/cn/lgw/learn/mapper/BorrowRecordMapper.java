package cn.lgw.learn.mapper;

import cn.lgw.learn.domain.BorrowRecordDO;
import cn.lgw.learn.domain.condition.BorrowRecordCondition;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BorrowRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_record
     *
     * @mbggenerated Sat Mar 17 23:32:27 CST 2018
     */
    int countByExample(BorrowRecordCondition example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_record
     *
     * @mbggenerated Sat Mar 17 23:32:27 CST 2018
     */
    int deleteByExample(BorrowRecordCondition example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_record
     *
     * @mbggenerated Sat Mar 17 23:32:27 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_record
     *
     * @mbggenerated Sat Mar 17 23:32:27 CST 2018
     */
    int insert(BorrowRecordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_record
     *
     * @mbggenerated Sat Mar 17 23:32:27 CST 2018
     */
    int insertSelective(BorrowRecordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_record
     *
     * @mbggenerated Sat Mar 17 23:32:27 CST 2018
     */
    List<BorrowRecordDO> selectByExample(BorrowRecordCondition example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_record
     *
     * @mbggenerated Sat Mar 17 23:32:27 CST 2018
     */
    BorrowRecordDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_record
     *
     * @mbggenerated Sat Mar 17 23:32:27 CST 2018
     */
    int updateByExampleSelective(@Param("record") BorrowRecordDO record, @Param("example") BorrowRecordCondition example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_record
     *
     * @mbggenerated Sat Mar 17 23:32:27 CST 2018
     */
    int updateByExample(@Param("record") BorrowRecordDO record, @Param("example") BorrowRecordCondition example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_record
     *
     * @mbggenerated Sat Mar 17 23:32:27 CST 2018
     */
    int updateByPrimaryKeySelective(BorrowRecordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_record
     *
     * @mbggenerated Sat Mar 17 23:32:27 CST 2018
     */
    int updateByPrimaryKey(BorrowRecordDO record);
}