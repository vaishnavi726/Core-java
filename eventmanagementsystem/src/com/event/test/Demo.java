package com.event.test;

import com.eventmanagementsystem.Event;
import com.eventmanagementsystem.Orgainzer;

public class Demo {
	public static void main(String[] args) {
		
		//Orgainzer organizer = new Orgainzer(45l,"singing event");
		Orgainzer organizer= new Orgainzer();  // in organizer class there is no constructor so it gives null
		System.out.println(organizer.getId());
		System.out.println(organizer.getName());
		
		Event event = new Event(67l, "gameshow", "Allarewelcome");
		System.out.println(event.getId() + " "+ event.getName()+" "+event.getDescription());
		
		
	}

}
