package com.codesphere.tech.ordermanagement.order;

import com.codesphere.tech.ordermanagement.item.Item;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class OrderService {

    public List<Order> getOrders() {
        return List.of(
                new Order(
                    1L,
                        LocalDate.of(2020, Month.DECEMBER, 13),
                        List.of(
                                new Item(
                                        12L,
                                        "Hawaiian",
                                        15
                                )
                        )
                )
        );
    }
}
