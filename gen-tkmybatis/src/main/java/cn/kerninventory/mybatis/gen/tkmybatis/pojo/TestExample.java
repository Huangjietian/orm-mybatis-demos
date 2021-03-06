package cn.kerninventory.mybatis.gen.tkmybatis.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TestExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andCBigintIsNull() {
            addCriterion("c_bigint is null");
            return (Criteria) this;
        }

        public Criteria andCBigintIsNotNull() {
            addCriterion("c_bigint is not null");
            return (Criteria) this;
        }

        public Criteria andCBigintEqualTo(Long value) {
            addCriterion("c_bigint =", value, "cBigint");
            return (Criteria) this;
        }

        public Criteria andCBigintNotEqualTo(Long value) {
            addCriterion("c_bigint <>", value, "cBigint");
            return (Criteria) this;
        }

        public Criteria andCBigintGreaterThan(Long value) {
            addCriterion("c_bigint >", value, "cBigint");
            return (Criteria) this;
        }

        public Criteria andCBigintGreaterThanOrEqualTo(Long value) {
            addCriterion("c_bigint >=", value, "cBigint");
            return (Criteria) this;
        }

        public Criteria andCBigintLessThan(Long value) {
            addCriterion("c_bigint <", value, "cBigint");
            return (Criteria) this;
        }

        public Criteria andCBigintLessThanOrEqualTo(Long value) {
            addCriterion("c_bigint <=", value, "cBigint");
            return (Criteria) this;
        }

        public Criteria andCBigintIn(List<Long> values) {
            addCriterion("c_bigint in", values, "cBigint");
            return (Criteria) this;
        }

        public Criteria andCBigintNotIn(List<Long> values) {
            addCriterion("c_bigint not in", values, "cBigint");
            return (Criteria) this;
        }

        public Criteria andCBigintBetween(Long value1, Long value2) {
            addCriterion("c_bigint between", value1, value2, "cBigint");
            return (Criteria) this;
        }

        public Criteria andCBigintNotBetween(Long value1, Long value2) {
            addCriterion("c_bigint not between", value1, value2, "cBigint");
            return (Criteria) this;
        }

        public Criteria andCVarcharIsNull() {
            addCriterion("c_varchar is null");
            return (Criteria) this;
        }

        public Criteria andCVarcharIsNotNull() {
            addCriterion("c_varchar is not null");
            return (Criteria) this;
        }

        public Criteria andCVarcharEqualTo(String value) {
            addCriterion("c_varchar =", value, "cVarchar");
            return (Criteria) this;
        }

        public Criteria andCVarcharNotEqualTo(String value) {
            addCriterion("c_varchar <>", value, "cVarchar");
            return (Criteria) this;
        }

        public Criteria andCVarcharGreaterThan(String value) {
            addCriterion("c_varchar >", value, "cVarchar");
            return (Criteria) this;
        }

        public Criteria andCVarcharGreaterThanOrEqualTo(String value) {
            addCriterion("c_varchar >=", value, "cVarchar");
            return (Criteria) this;
        }

        public Criteria andCVarcharLessThan(String value) {
            addCriterion("c_varchar <", value, "cVarchar");
            return (Criteria) this;
        }

        public Criteria andCVarcharLessThanOrEqualTo(String value) {
            addCriterion("c_varchar <=", value, "cVarchar");
            return (Criteria) this;
        }

        public Criteria andCVarcharLike(String value) {
            addCriterion("c_varchar like", value, "cVarchar");
            return (Criteria) this;
        }

        public Criteria andCVarcharNotLike(String value) {
            addCriterion("c_varchar not like", value, "cVarchar");
            return (Criteria) this;
        }

        public Criteria andCVarcharIn(List<String> values) {
            addCriterion("c_varchar in", values, "cVarchar");
            return (Criteria) this;
        }

        public Criteria andCVarcharNotIn(List<String> values) {
            addCriterion("c_varchar not in", values, "cVarchar");
            return (Criteria) this;
        }

        public Criteria andCVarcharBetween(String value1, String value2) {
            addCriterion("c_varchar between", value1, value2, "cVarchar");
            return (Criteria) this;
        }

        public Criteria andCVarcharNotBetween(String value1, String value2) {
            addCriterion("c_varchar not between", value1, value2, "cVarchar");
            return (Criteria) this;
        }

        public Criteria andCBitIsNull() {
            addCriterion("c_bit is null");
            return (Criteria) this;
        }

        public Criteria andCBitIsNotNull() {
            addCriterion("c_bit is not null");
            return (Criteria) this;
        }

        public Criteria andCBitEqualTo(byte[] value) {
            addCriterion("c_bit =", value, "cBit");
            return (Criteria) this;
        }

        public Criteria andCBitNotEqualTo(byte[] value) {
            addCriterion("c_bit <>", value, "cBit");
            return (Criteria) this;
        }

        public Criteria andCBitGreaterThan(byte[] value) {
            addCriterion("c_bit >", value, "cBit");
            return (Criteria) this;
        }

        public Criteria andCBitGreaterThanOrEqualTo(byte[] value) {
            addCriterion("c_bit >=", value, "cBit");
            return (Criteria) this;
        }

        public Criteria andCBitLessThan(byte[] value) {
            addCriterion("c_bit <", value, "cBit");
            return (Criteria) this;
        }

        public Criteria andCBitLessThanOrEqualTo(byte[] value) {
            addCriterion("c_bit <=", value, "cBit");
            return (Criteria) this;
        }

        public Criteria andCBitIn(List<byte[]> values) {
            addCriterion("c_bit in", values, "cBit");
            return (Criteria) this;
        }

        public Criteria andCBitNotIn(List<byte[]> values) {
            addCriterion("c_bit not in", values, "cBit");
            return (Criteria) this;
        }

        public Criteria andCBitBetween(byte[] value1, byte[] value2) {
            addCriterion("c_bit between", value1, value2, "cBit");
            return (Criteria) this;
        }

        public Criteria andCBitNotBetween(byte[] value1, byte[] value2) {
            addCriterion("c_bit not between", value1, value2, "cBit");
            return (Criteria) this;
        }

        public Criteria andCCharIsNull() {
            addCriterion("c_char is null");
            return (Criteria) this;
        }

        public Criteria andCCharIsNotNull() {
            addCriterion("c_char is not null");
            return (Criteria) this;
        }

        public Criteria andCCharEqualTo(String value) {
            addCriterion("c_char =", value, "cChar");
            return (Criteria) this;
        }

        public Criteria andCCharNotEqualTo(String value) {
            addCriterion("c_char <>", value, "cChar");
            return (Criteria) this;
        }

        public Criteria andCCharGreaterThan(String value) {
            addCriterion("c_char >", value, "cChar");
            return (Criteria) this;
        }

        public Criteria andCCharGreaterThanOrEqualTo(String value) {
            addCriterion("c_char >=", value, "cChar");
            return (Criteria) this;
        }

        public Criteria andCCharLessThan(String value) {
            addCriterion("c_char <", value, "cChar");
            return (Criteria) this;
        }

        public Criteria andCCharLessThanOrEqualTo(String value) {
            addCriterion("c_char <=", value, "cChar");
            return (Criteria) this;
        }

        public Criteria andCCharLike(String value) {
            addCriterion("c_char like", value, "cChar");
            return (Criteria) this;
        }

        public Criteria andCCharNotLike(String value) {
            addCriterion("c_char not like", value, "cChar");
            return (Criteria) this;
        }

        public Criteria andCCharIn(List<String> values) {
            addCriterion("c_char in", values, "cChar");
            return (Criteria) this;
        }

        public Criteria andCCharNotIn(List<String> values) {
            addCriterion("c_char not in", values, "cChar");
            return (Criteria) this;
        }

        public Criteria andCCharBetween(String value1, String value2) {
            addCriterion("c_char between", value1, value2, "cChar");
            return (Criteria) this;
        }

        public Criteria andCCharNotBetween(String value1, String value2) {
            addCriterion("c_char not between", value1, value2, "cChar");
            return (Criteria) this;
        }

        public Criteria andCDateIsNull() {
            addCriterion("c_date is null");
            return (Criteria) this;
        }

        public Criteria andCDateIsNotNull() {
            addCriterion("c_date is not null");
            return (Criteria) this;
        }

        public Criteria andCDateEqualTo(Date value) {
            addCriterionForJDBCDate("c_date =", value, "cDate");
            return (Criteria) this;
        }

        public Criteria andCDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("c_date <>", value, "cDate");
            return (Criteria) this;
        }

        public Criteria andCDateGreaterThan(Date value) {
            addCriterionForJDBCDate("c_date >", value, "cDate");
            return (Criteria) this;
        }

        public Criteria andCDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c_date >=", value, "cDate");
            return (Criteria) this;
        }

        public Criteria andCDateLessThan(Date value) {
            addCriterionForJDBCDate("c_date <", value, "cDate");
            return (Criteria) this;
        }

        public Criteria andCDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c_date <=", value, "cDate");
            return (Criteria) this;
        }

        public Criteria andCDateIn(List<Date> values) {
            addCriterionForJDBCDate("c_date in", values, "cDate");
            return (Criteria) this;
        }

        public Criteria andCDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("c_date not in", values, "cDate");
            return (Criteria) this;
        }

        public Criteria andCDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("c_date between", value1, value2, "cDate");
            return (Criteria) this;
        }

        public Criteria andCDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("c_date not between", value1, value2, "cDate");
            return (Criteria) this;
        }

        public Criteria andCDatetimeIsNull() {
            addCriterion("c_datetime is null");
            return (Criteria) this;
        }

        public Criteria andCDatetimeIsNotNull() {
            addCriterion("c_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andCDatetimeEqualTo(Date value) {
            addCriterion("c_datetime =", value, "cDatetime");
            return (Criteria) this;
        }

        public Criteria andCDatetimeNotEqualTo(Date value) {
            addCriterion("c_datetime <>", value, "cDatetime");
            return (Criteria) this;
        }

        public Criteria andCDatetimeGreaterThan(Date value) {
            addCriterion("c_datetime >", value, "cDatetime");
            return (Criteria) this;
        }

        public Criteria andCDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("c_datetime >=", value, "cDatetime");
            return (Criteria) this;
        }

        public Criteria andCDatetimeLessThan(Date value) {
            addCriterion("c_datetime <", value, "cDatetime");
            return (Criteria) this;
        }

        public Criteria andCDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("c_datetime <=", value, "cDatetime");
            return (Criteria) this;
        }

        public Criteria andCDatetimeIn(List<Date> values) {
            addCriterion("c_datetime in", values, "cDatetime");
            return (Criteria) this;
        }

        public Criteria andCDatetimeNotIn(List<Date> values) {
            addCriterion("c_datetime not in", values, "cDatetime");
            return (Criteria) this;
        }

        public Criteria andCDatetimeBetween(Date value1, Date value2) {
            addCriterion("c_datetime between", value1, value2, "cDatetime");
            return (Criteria) this;
        }

        public Criteria andCDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("c_datetime not between", value1, value2, "cDatetime");
            return (Criteria) this;
        }

        public Criteria andCDecimalIsNull() {
            addCriterion("c_decimal is null");
            return (Criteria) this;
        }

        public Criteria andCDecimalIsNotNull() {
            addCriterion("c_decimal is not null");
            return (Criteria) this;
        }

        public Criteria andCDecimalEqualTo(Long value) {
            addCriterion("c_decimal =", value, "cDecimal");
            return (Criteria) this;
        }

        public Criteria andCDecimalNotEqualTo(Long value) {
            addCriterion("c_decimal <>", value, "cDecimal");
            return (Criteria) this;
        }

        public Criteria andCDecimalGreaterThan(Long value) {
            addCriterion("c_decimal >", value, "cDecimal");
            return (Criteria) this;
        }

        public Criteria andCDecimalGreaterThanOrEqualTo(Long value) {
            addCriterion("c_decimal >=", value, "cDecimal");
            return (Criteria) this;
        }

        public Criteria andCDecimalLessThan(Long value) {
            addCriterion("c_decimal <", value, "cDecimal");
            return (Criteria) this;
        }

        public Criteria andCDecimalLessThanOrEqualTo(Long value) {
            addCriterion("c_decimal <=", value, "cDecimal");
            return (Criteria) this;
        }

        public Criteria andCDecimalIn(List<Long> values) {
            addCriterion("c_decimal in", values, "cDecimal");
            return (Criteria) this;
        }

        public Criteria andCDecimalNotIn(List<Long> values) {
            addCriterion("c_decimal not in", values, "cDecimal");
            return (Criteria) this;
        }

        public Criteria andCDecimalBetween(Long value1, Long value2) {
            addCriterion("c_decimal between", value1, value2, "cDecimal");
            return (Criteria) this;
        }

        public Criteria andCDecimalNotBetween(Long value1, Long value2) {
            addCriterion("c_decimal not between", value1, value2, "cDecimal");
            return (Criteria) this;
        }

        public Criteria andCDoubleIsNull() {
            addCriterion("c_double is null");
            return (Criteria) this;
        }

        public Criteria andCDoubleIsNotNull() {
            addCriterion("c_double is not null");
            return (Criteria) this;
        }

        public Criteria andCDoubleEqualTo(Double value) {
            addCriterion("c_double =", value, "cDouble");
            return (Criteria) this;
        }

        public Criteria andCDoubleNotEqualTo(Double value) {
            addCriterion("c_double <>", value, "cDouble");
            return (Criteria) this;
        }

        public Criteria andCDoubleGreaterThan(Double value) {
            addCriterion("c_double >", value, "cDouble");
            return (Criteria) this;
        }

        public Criteria andCDoubleGreaterThanOrEqualTo(Double value) {
            addCriterion("c_double >=", value, "cDouble");
            return (Criteria) this;
        }

        public Criteria andCDoubleLessThan(Double value) {
            addCriterion("c_double <", value, "cDouble");
            return (Criteria) this;
        }

        public Criteria andCDoubleLessThanOrEqualTo(Double value) {
            addCriterion("c_double <=", value, "cDouble");
            return (Criteria) this;
        }

        public Criteria andCDoubleIn(List<Double> values) {
            addCriterion("c_double in", values, "cDouble");
            return (Criteria) this;
        }

        public Criteria andCDoubleNotIn(List<Double> values) {
            addCriterion("c_double not in", values, "cDouble");
            return (Criteria) this;
        }

        public Criteria andCDoubleBetween(Double value1, Double value2) {
            addCriterion("c_double between", value1, value2, "cDouble");
            return (Criteria) this;
        }

        public Criteria andCDoubleNotBetween(Double value1, Double value2) {
            addCriterion("c_double not between", value1, value2, "cDouble");
            return (Criteria) this;
        }

        public Criteria andCFloatIsNull() {
            addCriterion("c_float is null");
            return (Criteria) this;
        }

        public Criteria andCFloatIsNotNull() {
            addCriterion("c_float is not null");
            return (Criteria) this;
        }

        public Criteria andCFloatEqualTo(Float value) {
            addCriterion("c_float =", value, "cFloat");
            return (Criteria) this;
        }

        public Criteria andCFloatNotEqualTo(Float value) {
            addCriterion("c_float <>", value, "cFloat");
            return (Criteria) this;
        }

        public Criteria andCFloatGreaterThan(Float value) {
            addCriterion("c_float >", value, "cFloat");
            return (Criteria) this;
        }

        public Criteria andCFloatGreaterThanOrEqualTo(Float value) {
            addCriterion("c_float >=", value, "cFloat");
            return (Criteria) this;
        }

        public Criteria andCFloatLessThan(Float value) {
            addCriterion("c_float <", value, "cFloat");
            return (Criteria) this;
        }

        public Criteria andCFloatLessThanOrEqualTo(Float value) {
            addCriterion("c_float <=", value, "cFloat");
            return (Criteria) this;
        }

        public Criteria andCFloatIn(List<Float> values) {
            addCriterion("c_float in", values, "cFloat");
            return (Criteria) this;
        }

        public Criteria andCFloatNotIn(List<Float> values) {
            addCriterion("c_float not in", values, "cFloat");
            return (Criteria) this;
        }

        public Criteria andCFloatBetween(Float value1, Float value2) {
            addCriterion("c_float between", value1, value2, "cFloat");
            return (Criteria) this;
        }

        public Criteria andCFloatNotBetween(Float value1, Float value2) {
            addCriterion("c_float not between", value1, value2, "cFloat");
            return (Criteria) this;
        }

        public Criteria andCIntIsNull() {
            addCriterion("c_int is null");
            return (Criteria) this;
        }

        public Criteria andCIntIsNotNull() {
            addCriterion("c_int is not null");
            return (Criteria) this;
        }

        public Criteria andCIntEqualTo(Integer value) {
            addCriterion("c_int =", value, "cInt");
            return (Criteria) this;
        }

        public Criteria andCIntNotEqualTo(Integer value) {
            addCriterion("c_int <>", value, "cInt");
            return (Criteria) this;
        }

        public Criteria andCIntGreaterThan(Integer value) {
            addCriterion("c_int >", value, "cInt");
            return (Criteria) this;
        }

        public Criteria andCIntGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_int >=", value, "cInt");
            return (Criteria) this;
        }

        public Criteria andCIntLessThan(Integer value) {
            addCriterion("c_int <", value, "cInt");
            return (Criteria) this;
        }

        public Criteria andCIntLessThanOrEqualTo(Integer value) {
            addCriterion("c_int <=", value, "cInt");
            return (Criteria) this;
        }

        public Criteria andCIntIn(List<Integer> values) {
            addCriterion("c_int in", values, "cInt");
            return (Criteria) this;
        }

        public Criteria andCIntNotIn(List<Integer> values) {
            addCriterion("c_int not in", values, "cInt");
            return (Criteria) this;
        }

        public Criteria andCIntBetween(Integer value1, Integer value2) {
            addCriterion("c_int between", value1, value2, "cInt");
            return (Criteria) this;
        }

        public Criteria andCIntNotBetween(Integer value1, Integer value2) {
            addCriterion("c_int not between", value1, value2, "cInt");
            return (Criteria) this;
        }

        public Criteria andCIntegerIsNull() {
            addCriterion("c_integer is null");
            return (Criteria) this;
        }

        public Criteria andCIntegerIsNotNull() {
            addCriterion("c_integer is not null");
            return (Criteria) this;
        }

        public Criteria andCIntegerEqualTo(Integer value) {
            addCriterion("c_integer =", value, "cInteger");
            return (Criteria) this;
        }

        public Criteria andCIntegerNotEqualTo(Integer value) {
            addCriterion("c_integer <>", value, "cInteger");
            return (Criteria) this;
        }

        public Criteria andCIntegerGreaterThan(Integer value) {
            addCriterion("c_integer >", value, "cInteger");
            return (Criteria) this;
        }

        public Criteria andCIntegerGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_integer >=", value, "cInteger");
            return (Criteria) this;
        }

        public Criteria andCIntegerLessThan(Integer value) {
            addCriterion("c_integer <", value, "cInteger");
            return (Criteria) this;
        }

        public Criteria andCIntegerLessThanOrEqualTo(Integer value) {
            addCriterion("c_integer <=", value, "cInteger");
            return (Criteria) this;
        }

        public Criteria andCIntegerIn(List<Integer> values) {
            addCriterion("c_integer in", values, "cInteger");
            return (Criteria) this;
        }

        public Criteria andCIntegerNotIn(List<Integer> values) {
            addCriterion("c_integer not in", values, "cInteger");
            return (Criteria) this;
        }

        public Criteria andCIntegerBetween(Integer value1, Integer value2) {
            addCriterion("c_integer between", value1, value2, "cInteger");
            return (Criteria) this;
        }

        public Criteria andCIntegerNotBetween(Integer value1, Integer value2) {
            addCriterion("c_integer not between", value1, value2, "cInteger");
            return (Criteria) this;
        }

        public Criteria andCMediumintIsNull() {
            addCriterion("c_mediumint is null");
            return (Criteria) this;
        }

        public Criteria andCMediumintIsNotNull() {
            addCriterion("c_mediumint is not null");
            return (Criteria) this;
        }

        public Criteria andCMediumintEqualTo(Integer value) {
            addCriterion("c_mediumint =", value, "cMediumint");
            return (Criteria) this;
        }

        public Criteria andCMediumintNotEqualTo(Integer value) {
            addCriterion("c_mediumint <>", value, "cMediumint");
            return (Criteria) this;
        }

        public Criteria andCMediumintGreaterThan(Integer value) {
            addCriterion("c_mediumint >", value, "cMediumint");
            return (Criteria) this;
        }

        public Criteria andCMediumintGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_mediumint >=", value, "cMediumint");
            return (Criteria) this;
        }

        public Criteria andCMediumintLessThan(Integer value) {
            addCriterion("c_mediumint <", value, "cMediumint");
            return (Criteria) this;
        }

        public Criteria andCMediumintLessThanOrEqualTo(Integer value) {
            addCriterion("c_mediumint <=", value, "cMediumint");
            return (Criteria) this;
        }

        public Criteria andCMediumintIn(List<Integer> values) {
            addCriterion("c_mediumint in", values, "cMediumint");
            return (Criteria) this;
        }

        public Criteria andCMediumintNotIn(List<Integer> values) {
            addCriterion("c_mediumint not in", values, "cMediumint");
            return (Criteria) this;
        }

        public Criteria andCMediumintBetween(Integer value1, Integer value2) {
            addCriterion("c_mediumint between", value1, value2, "cMediumint");
            return (Criteria) this;
        }

        public Criteria andCMediumintNotBetween(Integer value1, Integer value2) {
            addCriterion("c_mediumint not between", value1, value2, "cMediumint");
            return (Criteria) this;
        }

        public Criteria andCNumericIsNull() {
            addCriterion("c_numeric is null");
            return (Criteria) this;
        }

        public Criteria andCNumericIsNotNull() {
            addCriterion("c_numeric is not null");
            return (Criteria) this;
        }

        public Criteria andCNumericEqualTo(Long value) {
            addCriterion("c_numeric =", value, "cNumeric");
            return (Criteria) this;
        }

        public Criteria andCNumericNotEqualTo(Long value) {
            addCriterion("c_numeric <>", value, "cNumeric");
            return (Criteria) this;
        }

        public Criteria andCNumericGreaterThan(Long value) {
            addCriterion("c_numeric >", value, "cNumeric");
            return (Criteria) this;
        }

        public Criteria andCNumericGreaterThanOrEqualTo(Long value) {
            addCriterion("c_numeric >=", value, "cNumeric");
            return (Criteria) this;
        }

        public Criteria andCNumericLessThan(Long value) {
            addCriterion("c_numeric <", value, "cNumeric");
            return (Criteria) this;
        }

        public Criteria andCNumericLessThanOrEqualTo(Long value) {
            addCriterion("c_numeric <=", value, "cNumeric");
            return (Criteria) this;
        }

        public Criteria andCNumericIn(List<Long> values) {
            addCriterion("c_numeric in", values, "cNumeric");
            return (Criteria) this;
        }

        public Criteria andCNumericNotIn(List<Long> values) {
            addCriterion("c_numeric not in", values, "cNumeric");
            return (Criteria) this;
        }

        public Criteria andCNumericBetween(Long value1, Long value2) {
            addCriterion("c_numeric between", value1, value2, "cNumeric");
            return (Criteria) this;
        }

        public Criteria andCNumericNotBetween(Long value1, Long value2) {
            addCriterion("c_numeric not between", value1, value2, "cNumeric");
            return (Criteria) this;
        }

        public Criteria andCRealIsNull() {
            addCriterion("c_real is null");
            return (Criteria) this;
        }

        public Criteria andCRealIsNotNull() {
            addCriterion("c_real is not null");
            return (Criteria) this;
        }

        public Criteria andCRealEqualTo(Double value) {
            addCriterion("c_real =", value, "cReal");
            return (Criteria) this;
        }

        public Criteria andCRealNotEqualTo(Double value) {
            addCriterion("c_real <>", value, "cReal");
            return (Criteria) this;
        }

        public Criteria andCRealGreaterThan(Double value) {
            addCriterion("c_real >", value, "cReal");
            return (Criteria) this;
        }

        public Criteria andCRealGreaterThanOrEqualTo(Double value) {
            addCriterion("c_real >=", value, "cReal");
            return (Criteria) this;
        }

        public Criteria andCRealLessThan(Double value) {
            addCriterion("c_real <", value, "cReal");
            return (Criteria) this;
        }

        public Criteria andCRealLessThanOrEqualTo(Double value) {
            addCriterion("c_real <=", value, "cReal");
            return (Criteria) this;
        }

        public Criteria andCRealIn(List<Double> values) {
            addCriterion("c_real in", values, "cReal");
            return (Criteria) this;
        }

        public Criteria andCRealNotIn(List<Double> values) {
            addCriterion("c_real not in", values, "cReal");
            return (Criteria) this;
        }

        public Criteria andCRealBetween(Double value1, Double value2) {
            addCriterion("c_real between", value1, value2, "cReal");
            return (Criteria) this;
        }

        public Criteria andCRealNotBetween(Double value1, Double value2) {
            addCriterion("c_real not between", value1, value2, "cReal");
            return (Criteria) this;
        }

        public Criteria andCSmallintIsNull() {
            addCriterion("c_smallint is null");
            return (Criteria) this;
        }

        public Criteria andCSmallintIsNotNull() {
            addCriterion("c_smallint is not null");
            return (Criteria) this;
        }

        public Criteria andCSmallintEqualTo(Short value) {
            addCriterion("c_smallint =", value, "cSmallint");
            return (Criteria) this;
        }

        public Criteria andCSmallintNotEqualTo(Short value) {
            addCriterion("c_smallint <>", value, "cSmallint");
            return (Criteria) this;
        }

        public Criteria andCSmallintGreaterThan(Short value) {
            addCriterion("c_smallint >", value, "cSmallint");
            return (Criteria) this;
        }

        public Criteria andCSmallintGreaterThanOrEqualTo(Short value) {
            addCriterion("c_smallint >=", value, "cSmallint");
            return (Criteria) this;
        }

        public Criteria andCSmallintLessThan(Short value) {
            addCriterion("c_smallint <", value, "cSmallint");
            return (Criteria) this;
        }

        public Criteria andCSmallintLessThanOrEqualTo(Short value) {
            addCriterion("c_smallint <=", value, "cSmallint");
            return (Criteria) this;
        }

        public Criteria andCSmallintIn(List<Short> values) {
            addCriterion("c_smallint in", values, "cSmallint");
            return (Criteria) this;
        }

        public Criteria andCSmallintNotIn(List<Short> values) {
            addCriterion("c_smallint not in", values, "cSmallint");
            return (Criteria) this;
        }

        public Criteria andCSmallintBetween(Short value1, Short value2) {
            addCriterion("c_smallint between", value1, value2, "cSmallint");
            return (Criteria) this;
        }

        public Criteria andCSmallintNotBetween(Short value1, Short value2) {
            addCriterion("c_smallint not between", value1, value2, "cSmallint");
            return (Criteria) this;
        }

        public Criteria andCTimeIsNull() {
            addCriterion("c_time is null");
            return (Criteria) this;
        }

        public Criteria andCTimeIsNotNull() {
            addCriterion("c_time is not null");
            return (Criteria) this;
        }

        public Criteria andCTimeEqualTo(Date value) {
            addCriterionForJDBCTime("c_time =", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("c_time <>", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("c_time >", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("c_time >=", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeLessThan(Date value) {
            addCriterionForJDBCTime("c_time <", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("c_time <=", value, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeIn(List<Date> values) {
            addCriterionForJDBCTime("c_time in", values, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("c_time not in", values, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("c_time between", value1, value2, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("c_time not between", value1, value2, "cTime");
            return (Criteria) this;
        }

        public Criteria andCTimestampIsNull() {
            addCriterion("c_timestamp is null");
            return (Criteria) this;
        }

        public Criteria andCTimestampIsNotNull() {
            addCriterion("c_timestamp is not null");
            return (Criteria) this;
        }

        public Criteria andCTimestampEqualTo(Date value) {
            addCriterion("c_timestamp =", value, "cTimestamp");
            return (Criteria) this;
        }

        public Criteria andCTimestampNotEqualTo(Date value) {
            addCriterion("c_timestamp <>", value, "cTimestamp");
            return (Criteria) this;
        }

        public Criteria andCTimestampGreaterThan(Date value) {
            addCriterion("c_timestamp >", value, "cTimestamp");
            return (Criteria) this;
        }

        public Criteria andCTimestampGreaterThanOrEqualTo(Date value) {
            addCriterion("c_timestamp >=", value, "cTimestamp");
            return (Criteria) this;
        }

        public Criteria andCTimestampLessThan(Date value) {
            addCriterion("c_timestamp <", value, "cTimestamp");
            return (Criteria) this;
        }

        public Criteria andCTimestampLessThanOrEqualTo(Date value) {
            addCriterion("c_timestamp <=", value, "cTimestamp");
            return (Criteria) this;
        }

        public Criteria andCTimestampIn(List<Date> values) {
            addCriterion("c_timestamp in", values, "cTimestamp");
            return (Criteria) this;
        }

        public Criteria andCTimestampNotIn(List<Date> values) {
            addCriterion("c_timestamp not in", values, "cTimestamp");
            return (Criteria) this;
        }

        public Criteria andCTimestampBetween(Date value1, Date value2) {
            addCriterion("c_timestamp between", value1, value2, "cTimestamp");
            return (Criteria) this;
        }

        public Criteria andCTimestampNotBetween(Date value1, Date value2) {
            addCriterion("c_timestamp not between", value1, value2, "cTimestamp");
            return (Criteria) this;
        }

        public Criteria andCTinyintIsNull() {
            addCriterion("c_tinyint is null");
            return (Criteria) this;
        }

        public Criteria andCTinyintIsNotNull() {
            addCriterion("c_tinyint is not null");
            return (Criteria) this;
        }

        public Criteria andCTinyintEqualTo(Byte value) {
            addCriterion("c_tinyint =", value, "cTinyint");
            return (Criteria) this;
        }

        public Criteria andCTinyintNotEqualTo(Byte value) {
            addCriterion("c_tinyint <>", value, "cTinyint");
            return (Criteria) this;
        }

        public Criteria andCTinyintGreaterThan(Byte value) {
            addCriterion("c_tinyint >", value, "cTinyint");
            return (Criteria) this;
        }

        public Criteria andCTinyintGreaterThanOrEqualTo(Byte value) {
            addCriterion("c_tinyint >=", value, "cTinyint");
            return (Criteria) this;
        }

        public Criteria andCTinyintLessThan(Byte value) {
            addCriterion("c_tinyint <", value, "cTinyint");
            return (Criteria) this;
        }

        public Criteria andCTinyintLessThanOrEqualTo(Byte value) {
            addCriterion("c_tinyint <=", value, "cTinyint");
            return (Criteria) this;
        }

        public Criteria andCTinyintIn(List<Byte> values) {
            addCriterion("c_tinyint in", values, "cTinyint");
            return (Criteria) this;
        }

        public Criteria andCTinyintNotIn(List<Byte> values) {
            addCriterion("c_tinyint not in", values, "cTinyint");
            return (Criteria) this;
        }

        public Criteria andCTinyintBetween(Byte value1, Byte value2) {
            addCriterion("c_tinyint between", value1, value2, "cTinyint");
            return (Criteria) this;
        }

        public Criteria andCTinyintNotBetween(Byte value1, Byte value2) {
            addCriterion("c_tinyint not between", value1, value2, "cTinyint");
            return (Criteria) this;
        }

        public Criteria andCTinytextIsNull() {
            addCriterion("c_tinytext is null");
            return (Criteria) this;
        }

        public Criteria andCTinytextIsNotNull() {
            addCriterion("c_tinytext is not null");
            return (Criteria) this;
        }

        public Criteria andCTinytextEqualTo(String value) {
            addCriterion("c_tinytext =", value, "cTinytext");
            return (Criteria) this;
        }

        public Criteria andCTinytextNotEqualTo(String value) {
            addCriterion("c_tinytext <>", value, "cTinytext");
            return (Criteria) this;
        }

        public Criteria andCTinytextGreaterThan(String value) {
            addCriterion("c_tinytext >", value, "cTinytext");
            return (Criteria) this;
        }

        public Criteria andCTinytextGreaterThanOrEqualTo(String value) {
            addCriterion("c_tinytext >=", value, "cTinytext");
            return (Criteria) this;
        }

        public Criteria andCTinytextLessThan(String value) {
            addCriterion("c_tinytext <", value, "cTinytext");
            return (Criteria) this;
        }

        public Criteria andCTinytextLessThanOrEqualTo(String value) {
            addCriterion("c_tinytext <=", value, "cTinytext");
            return (Criteria) this;
        }

        public Criteria andCTinytextLike(String value) {
            addCriterion("c_tinytext like", value, "cTinytext");
            return (Criteria) this;
        }

        public Criteria andCTinytextNotLike(String value) {
            addCriterion("c_tinytext not like", value, "cTinytext");
            return (Criteria) this;
        }

        public Criteria andCTinytextIn(List<String> values) {
            addCriterion("c_tinytext in", values, "cTinytext");
            return (Criteria) this;
        }

        public Criteria andCTinytextNotIn(List<String> values) {
            addCriterion("c_tinytext not in", values, "cTinytext");
            return (Criteria) this;
        }

        public Criteria andCTinytextBetween(String value1, String value2) {
            addCriterion("c_tinytext between", value1, value2, "cTinytext");
            return (Criteria) this;
        }

        public Criteria andCTinytextNotBetween(String value1, String value2) {
            addCriterion("c_tinytext not between", value1, value2, "cTinytext");
            return (Criteria) this;
        }

        public Criteria andCYearIsNull() {
            addCriterion("c_year is null");
            return (Criteria) this;
        }

        public Criteria andCYearIsNotNull() {
            addCriterion("c_year is not null");
            return (Criteria) this;
        }

        public Criteria andCYearEqualTo(Date value) {
            addCriterionForJDBCDate("c_year =", value, "cYear");
            return (Criteria) this;
        }

        public Criteria andCYearNotEqualTo(Date value) {
            addCriterionForJDBCDate("c_year <>", value, "cYear");
            return (Criteria) this;
        }

        public Criteria andCYearGreaterThan(Date value) {
            addCriterionForJDBCDate("c_year >", value, "cYear");
            return (Criteria) this;
        }

        public Criteria andCYearGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c_year >=", value, "cYear");
            return (Criteria) this;
        }

        public Criteria andCYearLessThan(Date value) {
            addCriterionForJDBCDate("c_year <", value, "cYear");
            return (Criteria) this;
        }

        public Criteria andCYearLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("c_year <=", value, "cYear");
            return (Criteria) this;
        }

        public Criteria andCYearIn(List<Date> values) {
            addCriterionForJDBCDate("c_year in", values, "cYear");
            return (Criteria) this;
        }

        public Criteria andCYearNotIn(List<Date> values) {
            addCriterionForJDBCDate("c_year not in", values, "cYear");
            return (Criteria) this;
        }

        public Criteria andCYearBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("c_year between", value1, value2, "cYear");
            return (Criteria) this;
        }

        public Criteria andCYearNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("c_year not between", value1, value2, "cYear");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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