package com.example.entity;

import java.util.Objects;

/**
 * @author admin
 * @ClassName Order
 * @Description
 * @Date 2019/10/16
 */
public class Order {
  private int userId;
  private int orderId;

  public Order() {
  }

  public Order(int userId,int orderId) {
    this.orderId=orderId;
    this.userId=userId;
  }

  public int getOrderId() {
    return orderId;
  }

  public void setOrderId(int orderId) {
    this.orderId=orderId;
  }

  public int getUserId() {
    return userId;
  }

  public void setUserId(int userId) {
    this.userId=userId;
  }

  @Override
  public String toString() {
    return "Order{" +
            "orderId=" + orderId +
            ", userId=" + userId +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if(this == o) return true;
    if(o == null || getClass() != o.getClass()) return false;
    Order order=(Order) o;
    return orderId == order.orderId &&
            userId == order.userId;
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId,userId);
  }
}
