/**
 * Copyright (C) 2014 Mirakl. www.mirakl.com - info@mirakl.com
 * All Right Reserved. Tous droits réservés.
 */

package fr.agilecoder.pages.contact;

import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.RequiredTextField;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;
import org.apache.wicket.validation.validator.EmailAddressValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by pierre
 * Date: 28/07/2014 13:40
 */
public class ContactForm extends Form {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public ContactForm(String id, Contact bean) {
        super(id, new CompoundPropertyModel(bean));
        add(new RequiredTextField("name"));
        add(new RequiredTextField("email").add(EmailAddressValidator.getInstance()));
    }

    public void onSubmit() {
        super.onSubmit();
        logger.info("submit my form");
        clearInput();

        IModel model = getModel();
        logger.info("model to be saved: " + model.toString());
    }

    public void onValidate() {
        super.onValidate();
        logger.info("validate my form");
    }

    public void onError() {
        super.onError();
        logger.info("errors on my form");
    }
}
