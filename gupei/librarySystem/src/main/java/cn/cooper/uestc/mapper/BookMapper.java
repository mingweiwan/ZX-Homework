package cn.cooper.uestc.mapper;

import cn.cooper.uestc.domain.BookDo;
import cn.cooper.uestc.domain.condition.BookCondition;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbggenerated Thu Jan 25 17:34:36 CST 2018
     */
    int countByExample(BookCondition example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbggenerated Thu Jan 25 17:34:36 CST 2018
     */
    int deleteByExample(BookCondition example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbggenerated Thu Jan 25 17:34:36 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbggenerated Thu Jan 25 17:34:36 CST 2018
     */
    int insert(BookDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbggenerated Thu Jan 25 17:34:36 CST 2018
     */
    int insertSelective(BookDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbggenerated Thu Jan 25 17:34:36 CST 2018
     */
    List<BookDo> selectByExample(BookCondition example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbggenerated Thu Jan 25 17:34:36 CST 2018
     */
    BookDo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbggenerated Thu Jan 25 17:34:36 CST 2018
     */
    int updateByExampleSelective(@Param("record") BookDo record, @Param("example") BookCondition example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbggenerated Thu Jan 25 17:34:36 CST 2018
     */
    int updateByExample(@Param("record") BookDo record, @Param("example") BookCondition example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbggenerated Thu Jan 25 17:34:36 CST 2018
     */
    int updateByPrimaryKeySelective(BookDo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book
     *
     * @mbggenerated Thu Jan 25 17:34:36 CST 2018
     */
    int updateByPrimaryKey(BookDo record);
}