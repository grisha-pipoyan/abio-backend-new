package com.brutus.abio.auth;

import com.brutus.abio.security.dto.TokenDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService service;

    @PostMapping("/authenticate")
    public ResponseEntity<Void> authenticate(@RequestBody UsernameAndPasswordAuthenticationRequest request,
                                             HttpServletResponse response) {
        TokenDTO token = service.authenticate(request);
        response.addHeader(HttpHeaders.AUTHORIZATION, token.getAccessToken());

        return ResponseEntity.ok().build();
    }

}
