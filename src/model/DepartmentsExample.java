package model;

import java.util.ArrayList;
import java.util.List;

public class DepartmentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    public DepartmentsExample() {
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

        public Criteria andDepartmentIdIsNull() {
            addCriterion("department_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("department_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(Integer value) {
            addCriterion("department_id =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(Integer value) {
            addCriterion("department_id <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(Integer value) {
            addCriterion("department_id >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("department_id >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(Integer value) {
            addCriterion("department_id <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("department_id <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<Integer> values) {
            addCriterion("department_id in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<Integer> values) {
            addCriterion("department_id not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(Integer value1, Integer value2) {
            addCriterion("department_id between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("department_id not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNull() {
            addCriterion("department_name is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIsNotNull() {
            addCriterion("department_name is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameEqualTo(String value) {
            addCriterion("department_name =", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotEqualTo(String value) {
            addCriterion("department_name <>", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThan(String value) {
            addCriterion("department_name >", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("department_name >=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThan(String value) {
            addCriterion("department_name <", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLessThanOrEqualTo(String value) {
            addCriterion("department_name <=", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameLike(String value) {
            addCriterion("department_name like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotLike(String value) {
            addCriterion("department_name not like", value, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameIn(List<String> values) {
            addCriterion("department_name in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotIn(List<String> values) {
            addCriterion("department_name not in", values, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameBetween(String value1, String value2) {
            addCriterion("department_name between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentNameNotBetween(String value1, String value2) {
            addCriterion("department_name not between", value1, value2, "departmentName");
            return (Criteria) this;
        }

        public Criteria andDepartmentManagerIdIsNull() {
            addCriterion("department_manager_id is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentManagerIdIsNotNull() {
            addCriterion("department_manager_id is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentManagerIdEqualTo(Integer value) {
            addCriterion("department_manager_id =", value, "departmentManagerId");
            return (Criteria) this;
        }

        public Criteria andDepartmentManagerIdNotEqualTo(Integer value) {
            addCriterion("department_manager_id <>", value, "departmentManagerId");
            return (Criteria) this;
        }

        public Criteria andDepartmentManagerIdGreaterThan(Integer value) {
            addCriterion("department_manager_id >", value, "departmentManagerId");
            return (Criteria) this;
        }

        public Criteria andDepartmentManagerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("department_manager_id >=", value, "departmentManagerId");
            return (Criteria) this;
        }

        public Criteria andDepartmentManagerIdLessThan(Integer value) {
            addCriterion("department_manager_id <", value, "departmentManagerId");
            return (Criteria) this;
        }

        public Criteria andDepartmentManagerIdLessThanOrEqualTo(Integer value) {
            addCriterion("department_manager_id <=", value, "departmentManagerId");
            return (Criteria) this;
        }

        public Criteria andDepartmentManagerIdIn(List<Integer> values) {
            addCriterion("department_manager_id in", values, "departmentManagerId");
            return (Criteria) this;
        }

        public Criteria andDepartmentManagerIdNotIn(List<Integer> values) {
            addCriterion("department_manager_id not in", values, "departmentManagerId");
            return (Criteria) this;
        }

        public Criteria andDepartmentManagerIdBetween(Integer value1, Integer value2) {
            addCriterion("department_manager_id between", value1, value2, "departmentManagerId");
            return (Criteria) this;
        }

        public Criteria andDepartmentManagerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("department_manager_id not between", value1, value2, "departmentManagerId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsActiveIsNull() {
            addCriterion("department_is_active is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsActiveIsNotNull() {
            addCriterion("department_is_active is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsActiveEqualTo(Boolean value) {
            addCriterion("department_is_active =", value, "departmentIsActive");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsActiveNotEqualTo(Boolean value) {
            addCriterion("department_is_active <>", value, "departmentIsActive");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsActiveGreaterThan(Boolean value) {
            addCriterion("department_is_active >", value, "departmentIsActive");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsActiveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("department_is_active >=", value, "departmentIsActive");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsActiveLessThan(Boolean value) {
            addCriterion("department_is_active <", value, "departmentIsActive");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsActiveLessThanOrEqualTo(Boolean value) {
            addCriterion("department_is_active <=", value, "departmentIsActive");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsActiveIn(List<Boolean> values) {
            addCriterion("department_is_active in", values, "departmentIsActive");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsActiveNotIn(List<Boolean> values) {
            addCriterion("department_is_active not in", values, "departmentIsActive");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsActiveBetween(Boolean value1, Boolean value2) {
            addCriterion("department_is_active between", value1, value2, "departmentIsActive");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsActiveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("department_is_active not between", value1, value2, "departmentIsActive");
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