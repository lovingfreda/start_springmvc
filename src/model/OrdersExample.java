package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrdersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public OrdersExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * @mbg.generated generated automatically, do not modify!
     */
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerIdIsNull() {
            addCriterion("order_customer_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerIdIsNotNull() {
            addCriterion("order_customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerIdEqualTo(Integer value) {
            addCriterion("order_customer_id =", value, "orderCustomerId");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerIdNotEqualTo(Integer value) {
            addCriterion("order_customer_id <>", value, "orderCustomerId");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerIdGreaterThan(Integer value) {
            addCriterion("order_customer_id >", value, "orderCustomerId");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_customer_id >=", value, "orderCustomerId");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerIdLessThan(Integer value) {
            addCriterion("order_customer_id <", value, "orderCustomerId");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_customer_id <=", value, "orderCustomerId");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerIdIn(List<Integer> values) {
            addCriterion("order_customer_id in", values, "orderCustomerId");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerIdNotIn(List<Integer> values) {
            addCriterion("order_customer_id not in", values, "orderCustomerId");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("order_customer_id between", value1, value2, "orderCustomerId");
            return (Criteria) this;
        }

        public Criteria andOrderCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_customer_id not between", value1, value2, "orderCustomerId");
            return (Criteria) this;
        }

        public Criteria andOrderDateIsNull() {
            addCriterion("order_date is null");
            return (Criteria) this;
        }

        public Criteria andOrderDateIsNotNull() {
            addCriterion("order_date is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDateEqualTo(Date value) {
            addCriterion("order_date =", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotEqualTo(Date value) {
            addCriterion("order_date <>", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThan(Date value) {
            addCriterion("order_date >", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateGreaterThanOrEqualTo(Date value) {
            addCriterion("order_date >=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThan(Date value) {
            addCriterion("order_date <", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateLessThanOrEqualTo(Date value) {
            addCriterion("order_date <=", value, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateIn(List<Date> values) {
            addCriterion("order_date in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotIn(List<Date> values) {
            addCriterion("order_date not in", values, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateBetween(Date value1, Date value2) {
            addCriterion("order_date between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderDateNotBetween(Date value1, Date value2) {
            addCriterion("order_date not between", value1, value2, "orderDate");
            return (Criteria) this;
        }

        public Criteria andOrderShipAddressIsNull() {
            addCriterion("order_ship_address is null");
            return (Criteria) this;
        }

        public Criteria andOrderShipAddressIsNotNull() {
            addCriterion("order_ship_address is not null");
            return (Criteria) this;
        }

        public Criteria andOrderShipAddressEqualTo(String value) {
            addCriterion("order_ship_address =", value, "orderShipAddress");
            return (Criteria) this;
        }

        public Criteria andOrderShipAddressNotEqualTo(String value) {
            addCriterion("order_ship_address <>", value, "orderShipAddress");
            return (Criteria) this;
        }

        public Criteria andOrderShipAddressGreaterThan(String value) {
            addCriterion("order_ship_address >", value, "orderShipAddress");
            return (Criteria) this;
        }

        public Criteria andOrderShipAddressGreaterThanOrEqualTo(String value) {
            addCriterion("order_ship_address >=", value, "orderShipAddress");
            return (Criteria) this;
        }

        public Criteria andOrderShipAddressLessThan(String value) {
            addCriterion("order_ship_address <", value, "orderShipAddress");
            return (Criteria) this;
        }

        public Criteria andOrderShipAddressLessThanOrEqualTo(String value) {
            addCriterion("order_ship_address <=", value, "orderShipAddress");
            return (Criteria) this;
        }

        public Criteria andOrderShipAddressLike(String value) {
            addCriterion("order_ship_address like", value, "orderShipAddress");
            return (Criteria) this;
        }

        public Criteria andOrderShipAddressNotLike(String value) {
            addCriterion("order_ship_address not like", value, "orderShipAddress");
            return (Criteria) this;
        }

        public Criteria andOrderShipAddressIn(List<String> values) {
            addCriterion("order_ship_address in", values, "orderShipAddress");
            return (Criteria) this;
        }

        public Criteria andOrderShipAddressNotIn(List<String> values) {
            addCriterion("order_ship_address not in", values, "orderShipAddress");
            return (Criteria) this;
        }

        public Criteria andOrderShipAddressBetween(String value1, String value2) {
            addCriterion("order_ship_address between", value1, value2, "orderShipAddress");
            return (Criteria) this;
        }

        public Criteria andOrderShipAddressNotBetween(String value1, String value2) {
            addCriterion("order_ship_address not between", value1, value2, "orderShipAddress");
            return (Criteria) this;
        }

        public Criteria andOrderShipCityIsNull() {
            addCriterion("order_ship_city is null");
            return (Criteria) this;
        }

        public Criteria andOrderShipCityIsNotNull() {
            addCriterion("order_ship_city is not null");
            return (Criteria) this;
        }

        public Criteria andOrderShipCityEqualTo(String value) {
            addCriterion("order_ship_city =", value, "orderShipCity");
            return (Criteria) this;
        }

        public Criteria andOrderShipCityNotEqualTo(String value) {
            addCriterion("order_ship_city <>", value, "orderShipCity");
            return (Criteria) this;
        }

        public Criteria andOrderShipCityGreaterThan(String value) {
            addCriterion("order_ship_city >", value, "orderShipCity");
            return (Criteria) this;
        }

        public Criteria andOrderShipCityGreaterThanOrEqualTo(String value) {
            addCriterion("order_ship_city >=", value, "orderShipCity");
            return (Criteria) this;
        }

        public Criteria andOrderShipCityLessThan(String value) {
            addCriterion("order_ship_city <", value, "orderShipCity");
            return (Criteria) this;
        }

        public Criteria andOrderShipCityLessThanOrEqualTo(String value) {
            addCriterion("order_ship_city <=", value, "orderShipCity");
            return (Criteria) this;
        }

        public Criteria andOrderShipCityLike(String value) {
            addCriterion("order_ship_city like", value, "orderShipCity");
            return (Criteria) this;
        }

        public Criteria andOrderShipCityNotLike(String value) {
            addCriterion("order_ship_city not like", value, "orderShipCity");
            return (Criteria) this;
        }

        public Criteria andOrderShipCityIn(List<String> values) {
            addCriterion("order_ship_city in", values, "orderShipCity");
            return (Criteria) this;
        }

        public Criteria andOrderShipCityNotIn(List<String> values) {
            addCriterion("order_ship_city not in", values, "orderShipCity");
            return (Criteria) this;
        }

        public Criteria andOrderShipCityBetween(String value1, String value2) {
            addCriterion("order_ship_city between", value1, value2, "orderShipCity");
            return (Criteria) this;
        }

        public Criteria andOrderShipCityNotBetween(String value1, String value2) {
            addCriterion("order_ship_city not between", value1, value2, "orderShipCity");
            return (Criteria) this;
        }

        public Criteria andOrderShipStateIsNull() {
            addCriterion("order_ship_state is null");
            return (Criteria) this;
        }

        public Criteria andOrderShipStateIsNotNull() {
            addCriterion("order_ship_state is not null");
            return (Criteria) this;
        }

        public Criteria andOrderShipStateEqualTo(String value) {
            addCriterion("order_ship_state =", value, "orderShipState");
            return (Criteria) this;
        }

        public Criteria andOrderShipStateNotEqualTo(String value) {
            addCriterion("order_ship_state <>", value, "orderShipState");
            return (Criteria) this;
        }

        public Criteria andOrderShipStateGreaterThan(String value) {
            addCriterion("order_ship_state >", value, "orderShipState");
            return (Criteria) this;
        }

        public Criteria andOrderShipStateGreaterThanOrEqualTo(String value) {
            addCriterion("order_ship_state >=", value, "orderShipState");
            return (Criteria) this;
        }

        public Criteria andOrderShipStateLessThan(String value) {
            addCriterion("order_ship_state <", value, "orderShipState");
            return (Criteria) this;
        }

        public Criteria andOrderShipStateLessThanOrEqualTo(String value) {
            addCriterion("order_ship_state <=", value, "orderShipState");
            return (Criteria) this;
        }

        public Criteria andOrderShipStateLike(String value) {
            addCriterion("order_ship_state like", value, "orderShipState");
            return (Criteria) this;
        }

        public Criteria andOrderShipStateNotLike(String value) {
            addCriterion("order_ship_state not like", value, "orderShipState");
            return (Criteria) this;
        }

        public Criteria andOrderShipStateIn(List<String> values) {
            addCriterion("order_ship_state in", values, "orderShipState");
            return (Criteria) this;
        }

        public Criteria andOrderShipStateNotIn(List<String> values) {
            addCriterion("order_ship_state not in", values, "orderShipState");
            return (Criteria) this;
        }

        public Criteria andOrderShipStateBetween(String value1, String value2) {
            addCriterion("order_ship_state between", value1, value2, "orderShipState");
            return (Criteria) this;
        }

        public Criteria andOrderShipStateNotBetween(String value1, String value2) {
            addCriterion("order_ship_state not between", value1, value2, "orderShipState");
            return (Criteria) this;
        }

        public Criteria andOrderShipZipIsNull() {
            addCriterion("order_ship_zip is null");
            return (Criteria) this;
        }

        public Criteria andOrderShipZipIsNotNull() {
            addCriterion("order_ship_zip is not null");
            return (Criteria) this;
        }

        public Criteria andOrderShipZipEqualTo(String value) {
            addCriterion("order_ship_zip =", value, "orderShipZip");
            return (Criteria) this;
        }

        public Criteria andOrderShipZipNotEqualTo(String value) {
            addCriterion("order_ship_zip <>", value, "orderShipZip");
            return (Criteria) this;
        }

        public Criteria andOrderShipZipGreaterThan(String value) {
            addCriterion("order_ship_zip >", value, "orderShipZip");
            return (Criteria) this;
        }

        public Criteria andOrderShipZipGreaterThanOrEqualTo(String value) {
            addCriterion("order_ship_zip >=", value, "orderShipZip");
            return (Criteria) this;
        }

        public Criteria andOrderShipZipLessThan(String value) {
            addCriterion("order_ship_zip <", value, "orderShipZip");
            return (Criteria) this;
        }

        public Criteria andOrderShipZipLessThanOrEqualTo(String value) {
            addCriterion("order_ship_zip <=", value, "orderShipZip");
            return (Criteria) this;
        }

        public Criteria andOrderShipZipLike(String value) {
            addCriterion("order_ship_zip like", value, "orderShipZip");
            return (Criteria) this;
        }

        public Criteria andOrderShipZipNotLike(String value) {
            addCriterion("order_ship_zip not like", value, "orderShipZip");
            return (Criteria) this;
        }

        public Criteria andOrderShipZipIn(List<String> values) {
            addCriterion("order_ship_zip in", values, "orderShipZip");
            return (Criteria) this;
        }

        public Criteria andOrderShipZipNotIn(List<String> values) {
            addCriterion("order_ship_zip not in", values, "orderShipZip");
            return (Criteria) this;
        }

        public Criteria andOrderShipZipBetween(String value1, String value2) {
            addCriterion("order_ship_zip between", value1, value2, "orderShipZip");
            return (Criteria) this;
        }

        public Criteria andOrderShipZipNotBetween(String value1, String value2) {
            addCriterion("order_ship_zip not between", value1, value2, "orderShipZip");
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