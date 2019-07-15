package model;

import java.util.Date;

/**
 * Table: orders
 */
public class Orders {
    /**
     * Column: order_id
     */
    private Integer orderId;

    /**
     * Column: order_customer_id
     */
    private Integer orderCustomerId;

    /**
     * Column: order_date
     */
    private Date orderDate;

    /**
     * Column: order_ship_address
     */
    private String orderShipAddress;

    /**
     * Column: order_ship_city
     */
    private String orderShipCity;

    /**
     * Column: order_ship_state
     */
    private String orderShipState;

    /**
     * Column: order_ship_zip
     */
    private String orderShipZip;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getOrderCustomerId() {
        return orderCustomerId;
    }

    public void setOrderCustomerId(Integer orderCustomerId) {
        this.orderCustomerId = orderCustomerId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderShipAddress() {
        return orderShipAddress;
    }

    public void setOrderShipAddress(String orderShipAddress) {
        this.orderShipAddress = orderShipAddress == null ? null : orderShipAddress.trim();
    }

    public String getOrderShipCity() {
        return orderShipCity;
    }

    public void setOrderShipCity(String orderShipCity) {
        this.orderShipCity = orderShipCity == null ? null : orderShipCity.trim();
    }

    public String getOrderShipState() {
        return orderShipState;
    }

    public void setOrderShipState(String orderShipState) {
        this.orderShipState = orderShipState == null ? null : orderShipState.trim();
    }

    public String getOrderShipZip() {
        return orderShipZip;
    }

    public void setOrderShipZip(String orderShipZip) {
        this.orderShipZip = orderShipZip == null ? null : orderShipZip.trim();
    }
}