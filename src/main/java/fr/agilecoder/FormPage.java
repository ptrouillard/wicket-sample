/**
 * Copyright (C) 2014 Mirakl. www.mirakl.com - info@mirakl.com
 * All Right Reserved. Tous droits réservés.
 */

package fr.agilecoder;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.request.mapper.parameter.PageParameters;

/**
 * Created by pierre
 * Date: 28/07/2014 13:35
 */
public class FormPage extends WebPage {

    private static final long serialVersionUID = 1L;

    public FormPage(final PageParameters parameters) {
        super(parameters);

        FeedbackPanel feedback = new FeedbackPanel("feedback");
        add(feedback);

        add(new MyForm("myForm", new MyFormBean()));
    }
}
