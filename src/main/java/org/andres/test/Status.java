package org.andres.test;

public enum Status {
    ACTIVE, INACTIVE;

    static Status getStatus() {
        return INACTIVE;
    }
}
