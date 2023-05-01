package com.brutus.abio.service;

import com.brutus.abio.exception.BadRequestException;
import com.brutus.abio.exception.ConflictException;
import com.brutus.abio.exception.NotFoundException;
import com.brutus.abio.persistance.order.BlacklistRepository;
import com.brutus.abio.persistance.order.BlacklistedCustomer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class BlacklistCustomerService {

    private final BlacklistRepository blacklistRepository;

    public void findById(Long id){
        blacklistRepository.findById(id)
                .orElseThrow(() -> new NotFoundException(
                        String.format("Blacklisted customer with id %s not found", id)));
    }

    public void save(BlacklistedCustomer blacklistedCustomer) {

        if (blacklistRepository.findBlacklistedCustomerByEmailEquals(blacklistedCustomer.getEmail()).isPresent()) {
            throw new ConflictException(String.format("Customer with email %s is already in black list",
                    blacklistedCustomer.getEmail()));
        }

        blacklistedCustomer.setBlacklistedAt(LocalDateTime.now().toString());

        isCustomerInfosValid(blacklistedCustomer);

        blacklistRepository.save(blacklistedCustomer);
    }

    public void deleteCustomerFromBlacklist(Long id) {
        blacklistRepository.deleteById(id);
    }

    public boolean isCustomerEmailInBlacklist(String email) {
        return blacklistRepository.findBlacklistedCustomerByEmailEquals(email).isPresent();
    }

    public boolean isCustomerNumberInBlackList(String phoneNumber) {
        return blacklistRepository.findBlacklistedCustomerByPhoneNumberEquals(phoneNumber).isPresent();
    }

    public List<BlacklistedCustomer> getAllCustomers() {
        return blacklistRepository.findAll();
    }

    public void update(BlacklistedCustomer blacklistedCustomer){
        findById(blacklistedCustomer.getId());
        isCustomerInfosValid(blacklistedCustomer);

        blacklistRepository.save(blacklistedCustomer);
    }

    public void updateAll(List<BlacklistedCustomer> globalList) {
        for (BlacklistedCustomer blacklistedCustomer :
                globalList) {
            if(blacklistedCustomer.getId() != null){
                findById(blacklistedCustomer.getId());
            }
            isCustomerInfosValid(blacklistedCustomer);
            blacklistedCustomer.setBlacklistedAt(LocalDateTime.now().toString());
        }

        blacklistRepository.saveAll(globalList);
    }

    public void isCustomerInfosValid(BlacklistedCustomer blacklistedCustomer){
        if(!EmailValidator.isValidEmail(blacklistedCustomer.getEmail())){
            throw new BadRequestException(String.format("Invalid email: %s", blacklistedCustomer.getEmail()));
        }

        // TODO: 5/1/2023 for phone 
        
    }

}
