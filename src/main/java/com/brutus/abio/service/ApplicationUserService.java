package com.brutus.abio.service;

import com.brutus.abio.persistance.user.ApplicationUser;
import com.brutus.abio.persistance.user.ApplicationUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ApplicationUserService implements UserDetailsService {

    private final ApplicationUserRepository applicationUserRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return applicationUserRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException(String.format("User with email [%s] not found", email)));
    }

    public void save(ApplicationUser applicationUser) {
        applicationUserRepository.save(applicationUser);
    }

    public void delete(ApplicationUser applicationUser) {
        applicationUserRepository.delete(applicationUser);
    }

}
