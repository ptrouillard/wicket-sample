/**
 * Copyright (C) 2014 Mirakl. www.mirakl.com - info@mirakl.com
 * All Right Reserved. Tous droits réservés.
 */

package fr.agilecoder;

import java.io.Serializable;

/**
 * Created by pierre
 * Date: 28/07/2014 13:40
 */
public class MyFormBean implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
