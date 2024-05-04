package com.library.model;

public enum Genre {
    NOVEL("Novel"),
    HARLEQUIN ("Harlequin"),
    SCIENCE_FICTION("Science Fiction"),
    FANTASY("Fantasy"),
    THRILLER("Thriller"),
    HISTORICAL("Historical"),
    BIOGRAPHY("Biography"),
    POETRY("Poetry");

    private final String value;

    Genre(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
