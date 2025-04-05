package com.mason.library.library_checkout.Objects;

/**
 * Enum to represent the status of the user
 *
 * @author masonmyles
 */
public enum Status {
    ACTIVE("active"),
    INACTIVE("inactive");

    private final String status;

    Status(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
