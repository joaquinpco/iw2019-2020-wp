package com.vaadin.Views;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.ClickEvent;
import com.vaadin.flow.component.ComponentEventListener;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.router.Route;


@Route("")
public class MainView extends VerticalLayout {

    public MainView() {
    	
    	//Cabecera
    	add(new HeaderView());
       
     
    	//Pie de página
    	add(new FooterView());
    }

}

