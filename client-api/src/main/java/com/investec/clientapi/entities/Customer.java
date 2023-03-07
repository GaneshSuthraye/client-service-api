package com.investec.clientapi.entities;

import javax.persistence.*;

@Entity
@Table(name="client_details")
public class Customer {

    @Id
    @Column(name="client_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="mobile_number")
    private String mobileNumber;

    @Column(name="physical_address")
    private String address;


    public int getId() {
        return id;
    }

    public void setId(int id) {
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
}
