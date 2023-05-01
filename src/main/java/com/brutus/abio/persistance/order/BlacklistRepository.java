package com.brutus.abio.persistance.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
@Transactional
public interface BlacklistRepository extends JpaRepository<BlacklistedCustomer, Long> {

    Optional<BlacklistedCustomer> findBlacklistedCustomerByEmailEquals(String email);
    Optional<BlacklistedCustomer> findBlacklistedCustomerByPhoneNumberEquals(String email);

}
