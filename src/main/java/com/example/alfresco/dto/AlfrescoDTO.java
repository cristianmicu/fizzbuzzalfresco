package com.example.alfresco.dto;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@Component
public class AlfrescoDTO {

    private List<String> integers;

    public AlfrescoDTO(List<String> result) {
        this.integers = result;
    }

    public List<String> getIntegers() {
        return integers;
    }

    public void setIntegers(List<String> integers) {
        this.integers = integers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlfrescoDTO that = (AlfrescoDTO) o;
        return Objects.equals(integers, that.integers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(integers);
    }

    @Override
    public String toString() {
        return "AlfrescoDTO{" +
                "integers=" + integers +
                '}';
    }
}
