package com.tokenautocomplete;

import java.io.Serializable;

/**
 * Simple container object for contact data
 *
 * Created by mgod on 9/12/13.
 * @author mgod
 */
public class Person implements Serializable{
    private String name;
    private String email;

    public Person(String aName, String aEmail) {
        name = aName;
        email = aEmail;
    }

    public String getName() { return name; }
    public String getEmail() { return email; }

    @Override
    public String toString() { return name; }
}
