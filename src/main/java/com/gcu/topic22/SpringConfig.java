package com.gcu.topic22;

import com.gcu.topic22.business.AnotherOrdersBusinessService;
import com.gcu.topic22.business.OrdersBusinessService;
import com.gcu.topic22.business.OrdersBusinessServiceInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean(name = "ordersBusinessService")
    public OrdersBusinessServiceInterface getOrdersBusiness(){
        return new OrdersBusinessService();
    }
}
