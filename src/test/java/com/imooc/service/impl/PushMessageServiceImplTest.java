package com.imooc.service.impl;

import com.imooc.dto.OrderDTO;
import com.imooc.service.OrderService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class PushMessageServiceImplTest {

    @Autowired
    private PushMessageServiceImpl pushMessageService;

    @Autowired
    private OrderService orderService;

    @Test
    public void orderStatus() {
       OrderDTO orderDTO = orderService.findOne("78798");
        pushMessageService.orderStatus(orderDTO);
    }
}