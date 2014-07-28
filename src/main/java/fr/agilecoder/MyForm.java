/**
 * Copyright (C) 2014 Mirakl. www.mirakl.com - info@mirakl.com
 * All Right Reserved. Tous droits réservés.
 */

package fr.agilecoder;

import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.model.CompoundPropertyModel;

/**
 * Created by pierre
 * Date: 28/07/2014 13:40
 */
public class MyForm extends Form {

    public MyForm(String id, MyFormBean bean) {
        super(id, new CompoundPropertyModel(bean));
        add(new RequiredTextField("name"));
    }
}
