package com.example.alfresco.dto;

import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class AlfrescoDTO {

    private String outputTransformed;

    public AlfrescoDTO() {
    }

    public AlfrescoDTO(String outputTransformed) {
        this.outputTransformed = outputTransformed;
    }

    public String getOutputTransformed() {
        return outputTransformed;
    }

    public void setOutputTransformed(String outputTransformed) {
        this.outputTransformed = outputTransformed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlfrescoDTO that = (AlfrescoDTO) o;
        return Objects.equals(outputTransformed, that.outputTransformed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(outputTransformed);
    }

    @Override
    public String toString() {
        return outputTransformed;
    }
}
