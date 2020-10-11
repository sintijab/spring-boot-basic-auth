package com.example.demo.security;

public enum ApplicationUserPermission {
    READ_STUDENT("student:read"),
    WRITE_STUDENT("student:write"),
    READ_COURSE("course:read"),
    WRITE_COURSE("course:write");

    private final String permission;


    ApplicationUserPermission(String permission) {
        this.permission = permission;
    }
}
