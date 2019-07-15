package model;

/**
 * Table: departments
 */
public class Departments {
    /**
     * Column: department_id
     */
    private Integer departmentId;

    /**
     * Column: department_name
     */
    private String departmentName;

    /**
     * Column: department_manager_id
     */
    private Integer departmentManagerId;

    /**
     * Column: department_is_active
     */
    private Boolean departmentIsActive;

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    public Integer getDepartmentManagerId() {
        return departmentManagerId;
    }

    public void setDepartmentManagerId(Integer departmentManagerId) {
        this.departmentManagerId = departmentManagerId;
    }

    public Boolean getDepartmentIsActive() {
        return departmentIsActive;
    }

    public void setDepartmentIsActive(Boolean departmentIsActive) {
        this.departmentIsActive = departmentIsActive;
    }
}