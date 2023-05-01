package com.brutus.abio.persistance.user;

import com.google.common.collect.Sets;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Set;
import java.util.stream.Collectors;

public enum Role {
    ADMIN(Sets.newHashSet(UserPermission.USER_DELETE,
            UserPermission.USER_VERIFY,
            UserPermission.DATA_UPDATE,
            UserPermission.DATA_DELETE,
            UserPermission.DATA_ADD)),
    USER(Sets.newHashSet()),
    STARTER(Sets.newHashSet()),
    BUYER(Sets.newHashSet()),
    HC(Sets.newHashSet(UserPermission.DATA_ADD,
            UserPermission.DATA_UPDATE));

    private final Set<UserPermission> permissions;

    Role(Set<UserPermission> permissions) {
        this.permissions = permissions;
    }

    public Set<UserPermission> getPermissions() {
        return permissions;
    }

    public Set<SimpleGrantedAuthority> getGrantedAuthorities() {
        Set<SimpleGrantedAuthority> permissions = getPermissions().stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                .collect(Collectors.toSet());

        permissions.add(new SimpleGrantedAuthority("ROLE_" + this.name()));

        return permissions;
    }

}
