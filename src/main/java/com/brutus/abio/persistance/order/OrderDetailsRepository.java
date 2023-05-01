package com.brutus.abio.persistance.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Repository
@Transactional
public interface OrderDetailsRepository extends JpaRepository<OrderDetails, String> {

    List<OrderDetails> findAllByIsConfirmedEquals(Boolean isConfirmed);

    List<OrderDetails> findAllByPaymentStatusEquals(PaymentStatus paymentStatus);

    @Modifying
    @Query("SELECT o FROM OrderDetails o WHERE o.isConfirmed = false AND o.orderDateTime < :expirationTime")
    List<OrderDetails> findAllExpiredOrders(@Param("expirationTime") LocalDateTime expirationTime);


    @Modifying
    @Query("SELECT o FROM OrderDetails o WHERE o.orderDateTime < :expirationTime AND o.paymentType != 'CASH'")
    List<OrderDetails> findAllExpiredNonCashOrders(@Param("expirationTime") LocalDateTime expirationTime);

}
