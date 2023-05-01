package com.brutus.abio.persistance.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Repository
@Transactional
public interface CartRepository extends JpaRepository<Cart, UUID> {
}
