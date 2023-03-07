package com.investec.clientapi.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class Client {

    private Integer id;

    @NotBlank(message = "First Name is a mandatory field")
    private String firstName;
    @NotBlank(message = "Last Name is a mandatory field")
    private String lastName;
    @Pattern(regexp="^((0)|(27)|(\\+27))(\\d{9})$", message = "Invalid Mobile Number")
    private String mobileNumber;

    // can create a separate Address model if the entries might be created independently.
    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
