/**
 * Copyright (C) 2014 Mirakl. www.mirakl.com - info@mirakl.com
 * All Right Reserved. Tous droits réservés.
 */

package fr.agilecoder.pages.contact;

import java.io.Serializable;

/**
 * bean of web model
 * Created by pierre
 * Date: 28/07/2014 13:40
 */
public class Contact implements Serializable {

    private String email;
    private String name;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
