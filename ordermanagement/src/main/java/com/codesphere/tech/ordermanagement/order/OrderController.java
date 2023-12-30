package com.codesphere.tech.ordermanagement.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.codesphere.tech.ordermanagement.util.AppConstants.API_PATH;
import static com.codesphere.tech.ordermanagement.util.AppConstants.API_VERSION;

@RestController
@RequestMapping(
        path = API_PATH + API_VERSION
)
public class OrderController {

    private final OrderService orderService;
    public static final String PATH = "orders";

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping(
            path = PATH
    )
    public List<Order> getOrders(){
        return orderService.getOrders();
    }
}
