package com.vaadin.training.clientside.stepper;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

public class ServersidestepperUI extends UI {
	@Override
	public void init(VaadinRequest request) {
		Label label = new Label("Hello Vaadin user");
		VerticalLayout layout = new VerticalLayout();
		//TODO Stepper stepper = new Stepper();
		layout.addComponent(new Label("Stepper component"));
		//TODO layout.addComponent(stepper);
		layout.addComponent(label);
		//TODO label.setPropertyDataSource(stepper);
		setContent(layout);
	}
}
