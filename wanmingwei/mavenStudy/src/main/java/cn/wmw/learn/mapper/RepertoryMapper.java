package cn.wmw.learn.mapper;

import cn.wmw.learn.domain.RepertoryDO;
import cn.wmw.learn.domain.condition.RepertoryCondition;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepertoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repertory
     *
     * @mbggenerated Sun Mar 18 16:21:05 CST 2018
     */
    int countByExample(RepertoryCondition example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repertory
     *
     * @mbggenerated Sun Mar 18 16:21:05 CST 2018
     */
    int deleteByExample(RepertoryCondition example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repertory
     *
     * @mbggenerated Sun Mar 18 16:21:05 CST 2018
     */
    int deleteByPrimaryKey(Integer repId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repertory
     *
     * @mbggenerated Sun Mar 18 16:21:05 CST 2018
     */
    int insert(RepertoryDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repertory
     *
     * @mbggenerated Sun Mar 18 16:21:05 CST 2018
     */
    int insertSelective(RepertoryDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repertory
     *
     * @mbggenerated Sun Mar 18 16:21:05 CST 2018
     */
    List<RepertoryDO> selectByExample(RepertoryCondition example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repertory
     *
     * @mbggenerated Sun Mar 18 16:21:05 CST 2018
     */
    RepertoryDO selectByPrimaryKey(Integer repId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repertory
     *
     * @mbggenerated Sun Mar 18 16:21:05 CST 2018
     */
    int updateByExampleSelective(@Param("record") RepertoryDO record, @Param("example") RepertoryCondition example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repertory
     *
     * @mbggenerated Sun Mar 18 16:21:05 CST 2018
     */
    int updateByExample(@Param("record") RepertoryDO record, @Param("example") RepertoryCondition example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repertory
     *
     * @mbggenerated Sun Mar 18 16:21:05 CST 2018
     */
    int updateByPrimaryKeySelective(RepertoryDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table repertory
     *
     * @mbggenerated Sun Mar 18 16:21:05 CST 2018
     */
    int updateByPrimaryKey(RepertoryDO record);
}