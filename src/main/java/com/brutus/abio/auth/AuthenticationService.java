package com.brutus.abio.auth;

import com.brutus.abio.persistance.order.OrderDetails;
import com.brutus.abio.security.TokenGenerator;
import com.brutus.abio.security.dto.TokenDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final AuthenticationManager authenticationManager;
    private final TokenGenerator tokenGenerator;

    public TokenDTO authenticate(UsernameAndPasswordAuthenticationRequest request) {

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getUsername(),
                        request.getPassword()
                )
        );

        return tokenGenerator.createToken(authentication);
    }

    public String createJwtToken(OrderDetails orderDetails) {
        return tokenGenerator.createAccessTokenCustomer(
                orderDetails.getCustomer().getEmail(),
                orderDetails.getId(),
                orderDetails.getCart().getId());
    }

    public Jwt decodeJwtToken(String jwtToken) {
        return tokenGenerator.decodeJwtToken(jwtToken);
    }
}
