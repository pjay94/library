package com.library.model;

public enum Role {
    ADMINISTRATOR("ADMIN"), LIBRARIAN("LIB"), READER("READER");

    private String roleName;

    Role(String roleName) {
        this.roleName = roleName;
    }
}
