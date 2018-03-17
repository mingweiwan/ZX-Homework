package cn.lgw.learn.domain.condition;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class borrowRecordCondition {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table borrow_record
     *
     * @mbggenerated Sat Mar 17 23:19:27 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table borrow_record
     *
     * @mbggenerated Sat Mar 17 23:19:27 CST 2018
     */
    protected String limit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table borrow_record
     *
     * @mbggenerated Sat Mar 17 23:19:27 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table borrow_record
     *
     * @mbggenerated Sat Mar 17 23:19:27 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_record
     *
     * @mbggenerated Sat Mar 17 23:19:27 CST 2018
     */
    public borrowRecordCondition() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_record
     *
     * @mbggenerated Sat Mar 17 23:19:27 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_record
     *
     * @mbggenerated Sat Mar 17 23:19:27 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_record
     *
     * @mbggenerated Sat Mar 17 23:19:27 CST 2018
     */
    public void setLimit(String limit) {
        this.limit = limit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_record
     *
     * @mbggenerated Sat Mar 17 23:19:27 CST 2018
     */
    public String getLimit() {
        return limit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_record
     *
     * @mbggenerated Sat Mar 17 23:19:27 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_record
     *
     * @mbggenerated Sat Mar 17 23:19:27 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_record
     *
     * @mbggenerated Sat Mar 17 23:19:27 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_record
     *
     * @mbggenerated Sat Mar 17 23:19:27 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_record
     *
     * @mbggenerated Sat Mar 17 23:19:27 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_record
     *
     * @mbggenerated Sat Mar 17 23:19:27 CST 2018
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
     * This method corresponds to the database table borrow_record
     *
     * @mbggenerated Sat Mar 17 23:19:27 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table borrow_record
     *
     * @mbggenerated Sat Mar 17 23:19:27 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table borrow_record
     *
     * @mbggenerated Sat Mar 17 23:19:27 CST 2018
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andBookRepoIdIsNull() {
            addCriterion("book_repo_id is null");
            return (Criteria) this;
        }

        public Criteria andBookRepoIdIsNotNull() {
            addCriterion("book_repo_id is not null");
            return (Criteria) this;
        }

        public Criteria andBookRepoIdEqualTo(String value) {
            addCriterion("book_repo_id =", value, "bookRepoId");
            return (Criteria) this;
        }

        public Criteria andBookRepoIdNotEqualTo(String value) {
            addCriterion("book_repo_id <>", value, "bookRepoId");
            return (Criteria) this;
        }

        public Criteria andBookRepoIdGreaterThan(String value) {
            addCriterion("book_repo_id >", value, "bookRepoId");
            return (Criteria) this;
        }

        public Criteria andBookRepoIdGreaterThanOrEqualTo(String value) {
            addCriterion("book_repo_id >=", value, "bookRepoId");
            return (Criteria) this;
        }

        public Criteria andBookRepoIdLessThan(String value) {
            addCriterion("book_repo_id <", value, "bookRepoId");
            return (Criteria) this;
        }

        public Criteria andBookRepoIdLessThanOrEqualTo(String value) {
            addCriterion("book_repo_id <=", value, "bookRepoId");
            return (Criteria) this;
        }

        public Criteria andBookRepoIdLike(String value) {
            addCriterion("book_repo_id like", value, "bookRepoId");
            return (Criteria) this;
        }

        public Criteria andBookRepoIdNotLike(String value) {
            addCriterion("book_repo_id not like", value, "bookRepoId");
            return (Criteria) this;
        }

        public Criteria andBookRepoIdIn(List<String> values) {
            addCriterion("book_repo_id in", values, "bookRepoId");
            return (Criteria) this;
        }

        public Criteria andBookRepoIdNotIn(List<String> values) {
            addCriterion("book_repo_id not in", values, "bookRepoId");
            return (Criteria) this;
        }

        public Criteria andBookRepoIdBetween(String value1, String value2) {
            addCriterion("book_repo_id between", value1, value2, "bookRepoId");
            return (Criteria) this;
        }

        public Criteria andBookRepoIdNotBetween(String value1, String value2) {
            addCriterion("book_repo_id not between", value1, value2, "bookRepoId");
            return (Criteria) this;
        }

        public Criteria andBorrowTimeIsNull() {
            addCriterion("borrow_time is null");
            return (Criteria) this;
        }

        public Criteria andBorrowTimeIsNotNull() {
            addCriterion("borrow_time is not null");
            return (Criteria) this;
        }

        public Criteria andBorrowTimeEqualTo(Date value) {
            addCriterion("borrow_time =", value, "borrowTime");
            return (Criteria) this;
        }

        public Criteria andBorrowTimeNotEqualTo(Date value) {
            addCriterion("borrow_time <>", value, "borrowTime");
            return (Criteria) this;
        }

        public Criteria andBorrowTimeGreaterThan(Date value) {
            addCriterion("borrow_time >", value, "borrowTime");
            return (Criteria) this;
        }

        public Criteria andBorrowTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("borrow_time >=", value, "borrowTime");
            return (Criteria) this;
        }

        public Criteria andBorrowTimeLessThan(Date value) {
            addCriterion("borrow_time <", value, "borrowTime");
            return (Criteria) this;
        }

        public Criteria andBorrowTimeLessThanOrEqualTo(Date value) {
            addCriterion("borrow_time <=", value, "borrowTime");
            return (Criteria) this;
        }

        public Criteria andBorrowTimeIn(List<Date> values) {
            addCriterion("borrow_time in", values, "borrowTime");
            return (Criteria) this;
        }

        public Criteria andBorrowTimeNotIn(List<Date> values) {
            addCriterion("borrow_time not in", values, "borrowTime");
            return (Criteria) this;
        }

        public Criteria andBorrowTimeBetween(Date value1, Date value2) {
            addCriterion("borrow_time between", value1, value2, "borrowTime");
            return (Criteria) this;
        }

        public Criteria andBorrowTimeNotBetween(Date value1, Date value2) {
            addCriterion("borrow_time not between", value1, value2, "borrowTime");
            return (Criteria) this;
        }

        public Criteria andNeedReturnTimeIsNull() {
            addCriterion("need_return_time is null");
            return (Criteria) this;
        }

        public Criteria andNeedReturnTimeIsNotNull() {
            addCriterion("need_return_time is not null");
            return (Criteria) this;
        }

        public Criteria andNeedReturnTimeEqualTo(Date value) {
            addCriterion("need_return_time =", value, "needReturnTime");
            return (Criteria) this;
        }

        public Criteria andNeedReturnTimeNotEqualTo(Date value) {
            addCriterion("need_return_time <>", value, "needReturnTime");
            return (Criteria) this;
        }

        public Criteria andNeedReturnTimeGreaterThan(Date value) {
            addCriterion("need_return_time >", value, "needReturnTime");
            return (Criteria) this;
        }

        public Criteria andNeedReturnTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("need_return_time >=", value, "needReturnTime");
            return (Criteria) this;
        }

        public Criteria andNeedReturnTimeLessThan(Date value) {
            addCriterion("need_return_time <", value, "needReturnTime");
            return (Criteria) this;
        }

        public Criteria andNeedReturnTimeLessThanOrEqualTo(Date value) {
            addCriterion("need_return_time <=", value, "needReturnTime");
            return (Criteria) this;
        }

        public Criteria andNeedReturnTimeIn(List<Date> values) {
            addCriterion("need_return_time in", values, "needReturnTime");
            return (Criteria) this;
        }

        public Criteria andNeedReturnTimeNotIn(List<Date> values) {
            addCriterion("need_return_time not in", values, "needReturnTime");
            return (Criteria) this;
        }

        public Criteria andNeedReturnTimeBetween(Date value1, Date value2) {
            addCriterion("need_return_time between", value1, value2, "needReturnTime");
            return (Criteria) this;
        }

        public Criteria andNeedReturnTimeNotBetween(Date value1, Date value2) {
            addCriterion("need_return_time not between", value1, value2, "needReturnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeIsNull() {
            addCriterion("return_time is null");
            return (Criteria) this;
        }

        public Criteria andReturnTimeIsNotNull() {
            addCriterion("return_time is not null");
            return (Criteria) this;
        }

        public Criteria andReturnTimeEqualTo(Date value) {
            addCriterion("return_time =", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeNotEqualTo(Date value) {
            addCriterion("return_time <>", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeGreaterThan(Date value) {
            addCriterion("return_time >", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("return_time >=", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeLessThan(Date value) {
            addCriterion("return_time <", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeLessThanOrEqualTo(Date value) {
            addCriterion("return_time <=", value, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeIn(List<Date> values) {
            addCriterion("return_time in", values, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeNotIn(List<Date> values) {
            addCriterion("return_time not in", values, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeBetween(Date value1, Date value2) {
            addCriterion("return_time between", value1, value2, "returnTime");
            return (Criteria) this;
        }

        public Criteria andReturnTimeNotBetween(Date value1, Date value2) {
            addCriterion("return_time not between", value1, value2, "returnTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table borrow_record
     *
     * @mbggenerated do_not_delete_during_merge Sat Mar 17 23:19:27 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table borrow_record
     *
     * @mbggenerated Sat Mar 17 23:19:27 CST 2018
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