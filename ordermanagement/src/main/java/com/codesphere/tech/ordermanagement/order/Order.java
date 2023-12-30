package com.codesphere.tech.ordermanagement.order;

import com.codesphere.tech.ordermanagement.item.Item;

import java.time.LocalDate;
import java.util.List;

public class Order {
    public Long id;
    public LocalDate orderDate;
    public List<Item> items;

    public Order(Long id, LocalDate orderDate, List<Item> items) {
        this.id = id;
        this.orderDate = orderDate;
        this.items = items;
    }

    public Order(LocalDate orderDate, List<Item> items) {
        this.orderDate = orderDate;
        this.items = items;
    }

    public Order() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
