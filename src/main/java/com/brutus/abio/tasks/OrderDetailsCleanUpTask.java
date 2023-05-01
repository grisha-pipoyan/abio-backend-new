package com.brutus.abio.tasks;

import com.brutus.abio.persistance.order.OrderDetails;
import com.brutus.abio.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j
public class OrderDetailsCleanUpTask {
    private final OrderService orderService;

    @Scheduled(fixedRate = 60000) // run every minute
    public void cleanupExpiredOrders() {
        log.info("Cleaning up...");
        LocalDateTime expirationTime = LocalDateTime.now().minusMinutes(15);
        List<OrderDetails> orderDetails = orderService.findAllExpiredOrders(expirationTime);
        for (OrderDetails order :
                orderDetails) {
            orderService.delete(order);
        }
    }
}
