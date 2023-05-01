package com.brutus.abio;//package com.brutus.abio;

import com.brutus.abio.persistance.user.ApplicationUser;
import com.brutus.abio.persistance.user.ApplicationUserRepository;
import com.brutus.abio.persistance.user.Role;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {

    private final ApplicationUserRepository applicationUserRepository;

    private final PasswordEncoder passwordEncoder;

    public CommandLineAppStartupRunner(ApplicationUserRepository applicationUserRepository,
                                       PasswordEncoder passwordEncoder) {
        this.applicationUserRepository = applicationUserRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) {

        List<ApplicationUser> admins = applicationUserRepository.findCustomerByRoleEquals(Role.ADMIN);

        if (admins.size() == 0) {
            ApplicationUser applicationUser = new ApplicationUser();
            applicationUser.setFirst_name("abio admin");
            applicationUser.setLast_name("asdasdas");
            applicationUser.setEmail("abio@gmail.com");
            applicationUser.setPassword(passwordEncoder.encode("password"));
            applicationUser.setRole(Role.ADMIN);
            applicationUser.setEnabled(true);
            applicationUserRepository.save(applicationUser);
        }

        List<ApplicationUser> hcadmins =
                applicationUserRepository.findCustomerByRoleEquals(Role.HC);

        if (hcadmins.size() == 0) {
            ApplicationUser applicationUser = new ApplicationUser();
            applicationUser.setFirst_name("abio hc");
            applicationUser.setLast_name("asdasdas");
            applicationUser.setEmail("hc@gmail.com");
            applicationUser.setPassword(passwordEncoder.encode("password"));
            applicationUser.setRole(Role.HC);
            applicationUser.setEnabled(true);
            applicationUserRepository.save(applicationUser);
        }
    }

}
