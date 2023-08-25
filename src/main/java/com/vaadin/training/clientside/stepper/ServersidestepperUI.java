package com.vaadin.training.clientside.stepper;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class ServersidestepperUI extends UI {

    @WebServlet(value = "/*", asyncSupported = true)
    @VaadinServletConfiguration(productionMode = false, ui = ServersidestepperUI.class, widgetset = "com.vaadin.training.clientside.stepper.WidgetSet")
    public static class Servlet extends VaadinServlet {
    }

    @Override
    public void init(VaadinRequest request) {
        Label label = new Label("Hello Vaadin user");
        VerticalLayout layout = new VerticalLayout();

        Stepper stepper = new Stepper();
        layout.addComponent(stepper);
        layout.addComponent(label);
        label.setPropertyDataSource(stepper);
        setContent(layout);
    }

}
