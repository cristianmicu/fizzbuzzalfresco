package com.example.alfresco.dto;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@Component
public class AlfrescoDTO {

    private List<String> integers;

    private long fizzOccurrence;
    private long buzzOccurrence;
    private long alfrescoOccurrence;

    public AlfrescoDTO(List<String> result) {
        this.integers = result;
    }

    public List<String> getIntegers() {
        return integers;
    }

    public void setIntegers(List<String> integers) {
        this.integers = integers;
    }

    public long getFizzOccurrence() {
        return fizzOccurrence;
    }

    public void setFizzOccurrence(long fizzOccurrence) {
        this.fizzOccurrence = fizzOccurrence;
    }

    public long getBuzzOccurrence() {
        return buzzOccurrence;
    }

    public void setBuzzOccurrence(long buzzOccurrence) {
        this.buzzOccurrence = buzzOccurrence;
    }

    public long getAlfrescoOccurrence() {
        return alfrescoOccurrence;
    }

    public void setAlfrescoOccurrence(long alfrescoOccurrence) {
        this.alfrescoOccurrence = alfrescoOccurrence;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlfrescoDTO that = (AlfrescoDTO) o;
        return fizzOccurrence == that.fizzOccurrence && buzzOccurrence == that.buzzOccurrence && alfrescoOccurrence == that.alfrescoOccurrence && Objects.equals(integers, that.integers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(integers, fizzOccurrence, buzzOccurrence, alfrescoOccurrence);
    }

    @Override
    public String toString() {
        return "AlfrescoDTO{" +
                "result=" + integers +
                ", fizzOccurrence=" + fizzOccurrence +
                ", buzzOccurrence=" + buzzOccurrence +
                ", alfrescoOccurrence=" + alfrescoOccurrence +
                '}';
    }
}
