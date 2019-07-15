package model;

/**
 * Table: order_items
 */
public class OrderItems {
    /**
     * Column: order_item_id
     */
    private Integer orderItemId;

    /**
     * Column: order_id
     */
    private Integer orderId;

    /**
     * Column: product_id
     */
    private Integer productId;

    /**
     * Column: quantity
     */
    private Integer quantity;

    /**
     * Column: price
     */
    private Double price;

    public Integer getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(Integer orderItemId) {
        this.orderItemId = orderItemId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}