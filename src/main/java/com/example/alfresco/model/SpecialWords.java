package com.example.alfresco.model;

import java.util.Arrays;

public enum SpecialWords {
    FIZZ("fizz") {
        @Override
        public int getOccurrance(String text) {
            return (int) countOccurrence(text, getValue());
        }
    },
    BUZZ("buzz") {
        @Override
        public int getOccurrance(String text) {
            return (int) countOccurrence(text, getValue());
        }
    },
    FIZZBUZZ("fizzbuzz") {
        @Override
        public int getOccurrance(String text) {
            return (int) countOccurrence(text, getValue());
        }
    },
    ALFRESCO("alfresco") {
        @Override
        public int getOccurrance(String text) {
            return (int) countOccurrence(text, getValue());
        }
    },
    INTEGER("integer") {
        @Override
        public int getOccurrance(String text) {
            return (int) Arrays.stream(text.split(" "))
                    .filter(item -> item.matches("^[0-9]+"))
                    .count();
        }
    };

    private String value;

    public String getValue() {
        return this.value;
    }

    private SpecialWords(String value) {
        this.value = value;
    }

    public long countOccurrence(String textTransformed, String textToCount) {
        return Arrays.stream(textTransformed.split(" "))
                .filter(item -> item.equalsIgnoreCase(textToCount.trim()))
                .count();
    }

    public abstract int getOccurrance(String text);
}
