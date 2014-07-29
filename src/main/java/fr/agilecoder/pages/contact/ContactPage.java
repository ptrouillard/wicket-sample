/**
 * Copyright (C) 2014 Mirakl. www.mirakl.com - info@mirakl.com
 * All Right Reserved. Tous droits réservés.
 */

package fr.agilecoder.pages.contact;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.request.mapper.parameter.PageParameters;

/**
 * controller of the page
 * Created by pierre
 * Date: 28/07/2014 13:35
 */
public class ContactPage extends WebPage {

    private static final long serialVersionUID = 1L;

    public ContactPage(final PageParameters parameters) {
        super(parameters);

        FeedbackPanel feedback = new FeedbackPanel("feedback");
        add(feedback);

        add(new ContactForm("myForm", new Contact()));
    }
}
