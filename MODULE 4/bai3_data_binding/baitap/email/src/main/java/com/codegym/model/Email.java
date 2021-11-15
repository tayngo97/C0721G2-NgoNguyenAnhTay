package com.codegym.model;

import org.springframework.stereotype.Service;

@Service
public class Email {
    private String languages;
    private int pageSize;
    private boolean filler;
    private String signatures;

    public Email() {
    }

    public Email(String languages, int pageSize, boolean filler, String signatures) {
        this.languages = languages;
        this.pageSize = pageSize;
        this.filler = filler;
        this.signatures = signatures;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public boolean isFiller() {
        return filler;
    }

    public void setFiller(boolean filler) {
        this.filler = filler;
    }

    public String getSignatures() {
        return signatures;
    }

    public void setSignatures(String signatures) {
        this.signatures = signatures;
    }
}
