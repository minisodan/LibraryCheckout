package com.mason.library.library_checkout.objects;

import java.util.Objects;

/**
 * POJO to represent users
 *
 * @author masonmyles
 */
public class Users {
    private long id;
    private String first_name;
    private String last_name;
    private String email;
    private Status status;

    /**
     * Constructor
     *
     * @param first_name first name
     * @param last_name last name
     * @param email email
     * @param status is active
     */
    public Users(String first_name, String last_name, String email, Status status) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.status = status;
    }

    /**
     * Gets the user ID
     *
     * @return user ID.
     */
    public long getId() {
        return id;
    }

    /**
     * Gets the first name
     *
     * @return first name
     */
    public String getFirstName() {
        return first_name;
    }

    /**
     * Get the last name.
     *
     * @return last name
     */
    public String getLastName() {
        return last_name;
    }

    /**
     * Gets the email
     *
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Gets the active status
     *
     * @return {@code true} if user is active, {@code false}, otherwise.
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the ID
     *
     * @param id ID
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * Sets the first name
     *
     * @param first_name first name
     */
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    /**
     * Sets the last name
     *
     * @param last_name last name
     */
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    /**
     * Sets the email
     *
     * @param email email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Sets the status
     *
     * @param status status
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Users users)) return false;
        return id == users.id && status == users.status && Objects.equals(first_name, users.first_name) && Objects.equals(last_name, users.last_name) && Objects.equals(email, users.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, first_name, last_name, email, status);
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", status =" + status +
                '}';
    }
}
