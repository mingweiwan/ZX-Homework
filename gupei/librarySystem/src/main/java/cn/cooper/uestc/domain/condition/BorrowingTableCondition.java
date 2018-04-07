package cn.cooper.uestc.domain.condition;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BorrowingTableCondition {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table borrowing_table
     *
     * @mbggenerated Sun Mar 18 00:39:17 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table borrowing_table
     *
     * @mbggenerated Sun Mar 18 00:39:17 CST 2018
     */
    protected String limit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table borrowing_table
     *
     * @mbggenerated Sun Mar 18 00:39:17 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table borrowing_table
     *
     * @mbggenerated Sun Mar 18 00:39:17 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrowing_table
     *
     * @mbggenerated Sun Mar 18 00:39:17 CST 2018
     */
    public BorrowingTableCondition() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrowing_table
     *
     * @mbggenerated Sun Mar 18 00:39:17 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrowing_table
     *
     * @mbggenerated Sun Mar 18 00:39:17 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrowing_table
     *
     * @mbggenerated Sun Mar 18 00:39:17 CST 2018
     */
    public void setLimit(String limit) {
        this.limit = limit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrowing_table
     *
     * @mbggenerated Sun Mar 18 00:39:17 CST 2018
     */
    public String getLimit() {
        return limit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrowing_table
     *
     * @mbggenerated Sun Mar 18 00:39:17 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrowing_table
     *
     * @mbggenerated Sun Mar 18 00:39:17 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrowing_table
     *
     * @mbggenerated Sun Mar 18 00:39:17 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrowing_table
     *
     * @mbggenerated Sun Mar 18 00:39:17 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrowing_table
     *
     * @mbggenerated Sun Mar 18 00:39:17 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrowing_table
     *
     * @mbggenerated Sun Mar 18 00:39:17 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrowing_table
     *
     * @mbggenerated Sun Mar 18 00:39:17 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrowing_table
     *
     * @mbggenerated Sun Mar 18 00:39:17 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table borrowing_table
     *
     * @mbggenerated Sun Mar 18 00:39:17 CST 2018
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStudentsIdIsNull() {
            addCriterion("students_id is null");
            return (Criteria) this;
        }

        public Criteria andStudentsIdIsNotNull() {
            addCriterion("students_id is not null");
            return (Criteria) this;
        }

        public Criteria andStudentsIdEqualTo(Long value) {
            addCriterion("students_id =", value, "studentsId");
            return (Criteria) this;
        }

        public Criteria andStudentsIdNotEqualTo(Long value) {
            addCriterion("students_id <>", value, "studentsId");
            return (Criteria) this;
        }

        public Criteria andStudentsIdGreaterThan(Long value) {
            addCriterion("students_id >", value, "studentsId");
            return (Criteria) this;
        }

        public Criteria andStudentsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("students_id >=", value, "studentsId");
            return (Criteria) this;
        }

        public Criteria andStudentsIdLessThan(Long value) {
            addCriterion("students_id <", value, "studentsId");
            return (Criteria) this;
        }

        public Criteria andStudentsIdLessThanOrEqualTo(Long value) {
            addCriterion("students_id <=", value, "studentsId");
            return (Criteria) this;
        }

        public Criteria andStudentsIdIn(List<Long> values) {
            addCriterion("students_id in", values, "studentsId");
            return (Criteria) this;
        }

        public Criteria andStudentsIdNotIn(List<Long> values) {
            addCriterion("students_id not in", values, "studentsId");
            return (Criteria) this;
        }

        public Criteria andStudentsIdBetween(Long value1, Long value2) {
            addCriterion("students_id between", value1, value2, "studentsId");
            return (Criteria) this;
        }

        public Criteria andStudentsIdNotBetween(Long value1, Long value2) {
            addCriterion("students_id not between", value1, value2, "studentsId");
            return (Criteria) this;
        }

        public Criteria andStudentsNameIsNull() {
            addCriterion("students_name is null");
            return (Criteria) this;
        }

        public Criteria andStudentsNameIsNotNull() {
            addCriterion("students_name is not null");
            return (Criteria) this;
        }

        public Criteria andStudentsNameEqualTo(String value) {
            addCriterion("students_name =", value, "studentsName");
            return (Criteria) this;
        }

        public Criteria andStudentsNameNotEqualTo(String value) {
            addCriterion("students_name <>", value, "studentsName");
            return (Criteria) this;
        }

        public Criteria andStudentsNameGreaterThan(String value) {
            addCriterion("students_name >", value, "studentsName");
            return (Criteria) this;
        }

        public Criteria andStudentsNameGreaterThanOrEqualTo(String value) {
            addCriterion("students_name >=", value, "studentsName");
            return (Criteria) this;
        }

        public Criteria andStudentsNameLessThan(String value) {
            addCriterion("students_name <", value, "studentsName");
            return (Criteria) this;
        }

        public Criteria andStudentsNameLessThanOrEqualTo(String value) {
            addCriterion("students_name <=", value, "studentsName");
            return (Criteria) this;
        }

        public Criteria andStudentsNameLike(String value) {
            addCriterion("students_name like", value, "studentsName");
            return (Criteria) this;
        }

        public Criteria andStudentsNameNotLike(String value) {
            addCriterion("students_name not like", value, "studentsName");
            return (Criteria) this;
        }

        public Criteria andStudentsNameIn(List<String> values) {
            addCriterion("students_name in", values, "studentsName");
            return (Criteria) this;
        }

        public Criteria andStudentsNameNotIn(List<String> values) {
            addCriterion("students_name not in", values, "studentsName");
            return (Criteria) this;
        }

        public Criteria andStudentsNameBetween(String value1, String value2) {
            addCriterion("students_name between", value1, value2, "studentsName");
            return (Criteria) this;
        }

        public Criteria andStudentsNameNotBetween(String value1, String value2) {
            addCriterion("students_name not between", value1, value2, "studentsName");
            return (Criteria) this;
        }

        public Criteria andBorrowBookNameIsNull() {
            addCriterion("borrow_book_name is null");
            return (Criteria) this;
        }

        public Criteria andBorrowBookNameIsNotNull() {
            addCriterion("borrow_book_name is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowBookNameEqualTo(String value) {
            addCriterion("borrow_book_name =", value, "borrowBookName");
            return (Criteria) this;
        }

        public Criteria andBorrowBookNameNotEqualTo(String value) {
            addCriterion("borrow_book_name <>", value, "borrowBookName");
            return (Criteria) this;
        }

        public Criteria andBorrowBookNameGreaterThan(String value) {
            addCriterion("borrow_book_name >", value, "borrowBookName");
            return (Criteria) this;
        }

        public Criteria andBorrowBookNameGreaterThanOrEqualTo(String value) {
            addCriterion("borrow_book_name >=", value, "borrowBookName");
            return (Criteria) this;
        }

        public Criteria andBorrowBookNameLessThan(String value) {
            addCriterion("borrow_book_name <", value, "borrowBookName");
            return (Criteria) this;
        }

        public Criteria andBorrowBookNameLessThanOrEqualTo(String value) {
            addCriterion("borrow_book_name <=", value, "borrowBookName");
            return (Criteria) this;
        }

        public Criteria andBorrowBookNameLike(String value) {
            addCriterion("borrow_book_name like", value, "borrowBookName");
            return (Criteria) this;
        }

        public Criteria andBorrowBookNameNotLike(String value) {
            addCriterion("borrow_book_name not like", value, "borrowBookName");
            return (Criteria) this;
        }

        public Criteria andBorrowBookNameIn(List<String> values) {
            addCriterion("borrow_book_name in", values, "borrowBookName");
            return (Criteria) this;
        }

        public Criteria andBorrowBookNameNotIn(List<String> values) {
            addCriterion("borrow_book_name not in", values, "borrowBookName");
            return (Criteria) this;
        }

        public Criteria andBorrowBookNameBetween(String value1, String value2) {
            addCriterion("borrow_book_name between", value1, value2, "borrowBookName");
            return (Criteria) this;
        }

        public Criteria andBorrowBookNameNotBetween(String value1, String value2) {
            addCriterion("borrow_book_name not between", value1, value2, "borrowBookName");
            return (Criteria) this;
        }

        public Criteria andBorrowBookSerialnumberIsNull() {
            addCriterion("borrow_book_serialNumber is null");
            return (Criteria) this;
        }

        public Criteria andBorrowBookSerialnumberIsNotNull() {
            addCriterion("borrow_book_serialNumber is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowBookSerialnumberEqualTo(String value) {
            addCriterion("borrow_book_serialNumber =", value, "borrowBookSerialnumber");
            return (Criteria) this;
        }

        public Criteria andBorrowBookSerialnumberNotEqualTo(String value) {
            addCriterion("borrow_book_serialNumber <>", value, "borrowBookSerialnumber");
            return (Criteria) this;
        }

        public Criteria andBorrowBookSerialnumberGreaterThan(String value) {
            addCriterion("borrow_book_serialNumber >", value, "borrowBookSerialnumber");
            return (Criteria) this;
        }

        public Criteria andBorrowBookSerialnumberGreaterThanOrEqualTo(String value) {
            addCriterion("borrow_book_serialNumber >=", value, "borrowBookSerialnumber");
            return (Criteria) this;
        }

        public Criteria andBorrowBookSerialnumberLessThan(String value) {
            addCriterion("borrow_book_serialNumber <", value, "borrowBookSerialnumber");
            return (Criteria) this;
        }

        public Criteria andBorrowBookSerialnumberLessThanOrEqualTo(String value) {
            addCriterion("borrow_book_serialNumber <=", value, "borrowBookSerialnumber");
            return (Criteria) this;
        }

        public Criteria andBorrowBookSerialnumberLike(String value) {
            addCriterion("borrow_book_serialNumber like", value, "borrowBookSerialnumber");
            return (Criteria) this;
        }

        public Criteria andBorrowBookSerialnumberNotLike(String value) {
            addCriterion("borrow_book_serialNumber not like", value, "borrowBookSerialnumber");
            return (Criteria) this;
        }

        public Criteria andBorrowBookSerialnumberIn(List<String> values) {
            addCriterion("borrow_book_serialNumber in", values, "borrowBookSerialnumber");
            return (Criteria) this;
        }

        public Criteria andBorrowBookSerialnumberNotIn(List<String> values) {
            addCriterion("borrow_book_serialNumber not in", values, "borrowBookSerialnumber");
            return (Criteria) this;
        }

        public Criteria andBorrowBookSerialnumberBetween(String value1, String value2) {
            addCriterion("borrow_book_serialNumber between", value1, value2, "borrowBookSerialnumber");
            return (Criteria) this;
        }

        public Criteria andBorrowBookSerialnumberNotBetween(String value1, String value2) {
            addCriterion("borrow_book_serialNumber not between", value1, value2, "borrowBookSerialnumber");
            return (Criteria) this;
        }

        public Criteria andReturnDateIsNull() {
            addCriterion("return_date is null");
            return (Criteria) this;
        }

        public Criteria andReturnDateIsNotNull() {
            addCriterion("return_date is not null");
            return (Criteria) this;
        }

        public Criteria andReturnDateEqualTo(Date value) {
            addCriterionForJDBCDate("return_date =", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("return_date <>", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateGreaterThan(Date value) {
            addCriterionForJDBCDate("return_date >", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("return_date >=", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateLessThan(Date value) {
            addCriterionForJDBCDate("return_date <", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("return_date <=", value, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateIn(List<Date> values) {
            addCriterionForJDBCDate("return_date in", values, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("return_date not in", values, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("return_date between", value1, value2, "returnDate");
            return (Criteria) this;
        }

        public Criteria andReturnDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("return_date not between", value1, value2, "returnDate");
            return (Criteria) this;
        }

        public Criteria andActuralReturnDateIsNull() {
            addCriterion("actural_return_date is null");
            return (Criteria) this;
        }

        public Criteria andActuralReturnDateIsNotNull() {
            addCriterion("actural_return_date is not null");
            return (Criteria) this;
        }

        public Criteria andActuralReturnDateEqualTo(Date value) {
            addCriterionForJDBCDate("actural_return_date =", value, "acturalReturnDate");
            return (Criteria) this;
        }

        public Criteria andActuralReturnDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("actural_return_date <>", value, "acturalReturnDate");
            return (Criteria) this;
        }

        public Criteria andActuralReturnDateGreaterThan(Date value) {
            addCriterionForJDBCDate("actural_return_date >", value, "acturalReturnDate");
            return (Criteria) this;
        }

        public Criteria andActuralReturnDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("actural_return_date >=", value, "acturalReturnDate");
            return (Criteria) this;
        }

        public Criteria andActuralReturnDateLessThan(Date value) {
            addCriterionForJDBCDate("actural_return_date <", value, "acturalReturnDate");
            return (Criteria) this;
        }

        public Criteria andActuralReturnDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("actural_return_date <=", value, "acturalReturnDate");
            return (Criteria) this;
        }

        public Criteria andActuralReturnDateIn(List<Date> values) {
            addCriterionForJDBCDate("actural_return_date in", values, "acturalReturnDate");
            return (Criteria) this;
        }

        public Criteria andActuralReturnDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("actural_return_date not in", values, "acturalReturnDate");
            return (Criteria) this;
        }

        public Criteria andActuralReturnDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("actural_return_date between", value1, value2, "acturalReturnDate");
            return (Criteria) this;
        }

        public Criteria andActuralReturnDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("actural_return_date not between", value1, value2, "acturalReturnDate");
            return (Criteria) this;
        }

        public Criteria andBorrowingDateIsNull() {
            addCriterion("borrowing_date is null");
            return (Criteria) this;
        }

        public Criteria andBorrowingDateIsNotNull() {
            addCriterion("borrowing_date is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowingDateEqualTo(Date value) {
            addCriterionForJDBCDate("borrowing_date =", value, "borrowingDate");
            return (Criteria) this;
        }

        public Criteria andBorrowingDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("borrowing_date <>", value, "borrowingDate");
            return (Criteria) this;
        }

        public Criteria andBorrowingDateGreaterThan(Date value) {
            addCriterionForJDBCDate("borrowing_date >", value, "borrowingDate");
            return (Criteria) this;
        }

        public Criteria andBorrowingDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("borrowing_date >=", value, "borrowingDate");
            return (Criteria) this;
        }

        public Criteria andBorrowingDateLessThan(Date value) {
            addCriterionForJDBCDate("borrowing_date <", value, "borrowingDate");
            return (Criteria) this;
        }

        public Criteria andBorrowingDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("borrowing_date <=", value, "borrowingDate");
            return (Criteria) this;
        }

        public Criteria andBorrowingDateIn(List<Date> values) {
            addCriterionForJDBCDate("borrowing_date in", values, "borrowingDate");
            return (Criteria) this;
        }

        public Criteria andBorrowingDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("borrowing_date not in", values, "borrowingDate");
            return (Criteria) this;
        }

        public Criteria andBorrowingDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("borrowing_date between", value1, value2, "borrowingDate");
            return (Criteria) this;
        }

        public Criteria andBorrowingDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("borrowing_date not between", value1, value2, "borrowingDate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table borrowing_table
     *
     * @mbggenerated do_not_delete_during_merge Sun Mar 18 00:39:17 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table borrowing_table
     *
     * @mbggenerated Sun Mar 18 00:39:17 CST 2018
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}