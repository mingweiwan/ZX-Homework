package cn.wmw.learn.mapper;

import cn.wmw.learn.domain.BorrowDO;
import cn.wmw.learn.domain.condition.BorrowCondition;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BorrowMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow
     *
     * @mbggenerated Sun Mar 18 16:21:05 CST 2018
     */
    int countByExample(BorrowCondition example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow
     *
     * @mbggenerated Sun Mar 18 16:21:05 CST 2018
     */
    int deleteByExample(BorrowCondition example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow
     *
     * @mbggenerated Sun Mar 18 16:21:05 CST 2018
     */
    int deleteByPrimaryKey(Integer borId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow
     *
     * @mbggenerated Sun Mar 18 16:21:05 CST 2018
     */
    int insert(BorrowDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow
     *
     * @mbggenerated Sun Mar 18 16:21:05 CST 2018
     */
    int insertSelective(BorrowDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow
     *
     * @mbggenerated Sun Mar 18 16:21:05 CST 2018
     */
    List<BorrowDO> selectByExample(BorrowCondition example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow
     *
     * @mbggenerated Sun Mar 18 16:21:05 CST 2018
     */
    BorrowDO selectByPrimaryKey(Integer borId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow
     *
     * @mbggenerated Sun Mar 18 16:21:05 CST 2018
     */
    int updateByExampleSelective(@Param("record") BorrowDO record, @Param("example") BorrowCondition example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow
     *
     * @mbggenerated Sun Mar 18 16:21:05 CST 2018
     */
    int updateByExample(@Param("record") BorrowDO record, @Param("example") BorrowCondition example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow
     *
     * @mbggenerated Sun Mar 18 16:21:05 CST 2018
     */
    int updateByPrimaryKeySelective(BorrowDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow
     *
     * @mbggenerated Sun Mar 18 16:21:05 CST 2018
     */
    int updateByPrimaryKey(BorrowDO record);
}