package com.brutus.abio.security;

import com.brutus.abio.persistance.user.ApplicationUser;
import org.springframework.core.convert.converter.Converter;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class JwtToUserConverter implements Converter<Jwt, UsernamePasswordAuthenticationToken> {

    @Override
    public UsernamePasswordAuthenticationToken convert(Jwt jwt) {
        ApplicationUser user = new ApplicationUser();
        user.setEmail(jwt.getSubject());

        List<String> authorities = jwt.getClaim("authorities");

        Set<SimpleGrantedAuthority> simpleGrantedAuthorities = authorities.stream()
                .map(SimpleGrantedAuthority::new).collect(Collectors.toSet());

        return new UsernamePasswordAuthenticationToken(user, jwt, simpleGrantedAuthorities);

    }
}
