package com.brugnot.samples.spring.data.rest.core.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Antonin on 04/11/2016.
 */
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    /**
     * Person First Name
     */
    private String firstName;

    /**
     * Person Last Name
     */
    private String lastName;

    /**
     * Get the Person First Name
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Set the Person First Name
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Get the Person Last Name
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Set the Person Last Name
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
