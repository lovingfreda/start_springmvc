package model;

/**
 * Table: customers
 */
public class Customers {
    /**
     * Column: customer_id
     */
    private Integer customerId;

    /**
     * Column: customer_name
     */
    private String customerName;

    /**
     * Column: customer_phone
     */
    private String customerPhone;

    /**
     * Column: customer_address
     */
    private String customerAddress;

    /**
     * Column: customer_city
     */
    private String customerCity;

    /**
     * Column: customer_state
     */
    private String customerState;

    /**
     * Column: customer_zip
     */
    private String customerZip;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone == null ? null : customerPhone.trim();
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress == null ? null : customerAddress.trim();
    }

    public String getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(String customerCity) {
        this.customerCity = customerCity == null ? null : customerCity.trim();
    }

    public String getCustomerState() {
        return customerState;
    }

    public void setCustomerState(String customerState) {
        this.customerState = customerState == null ? null : customerState.trim();
    }

    public String getCustomerZip() {
        return customerZip;
    }

    public void setCustomerZip(String customerZip) {
        this.customerZip = customerZip == null ? null : customerZip.trim();
    }
}