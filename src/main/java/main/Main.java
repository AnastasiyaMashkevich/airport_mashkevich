package main;

import helper.XmlHelper;
import logic.Logic;
import bean.Airport;
import bean.FreighterPlane;
import bean.PassengerPlane;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		XmlHelper xmlHelper = new XmlHelper();
		Airport airport = xmlHelper.getAirport();

		ArrayList<PassengerPlane> passengers = airport.getPassangers();
		ArrayList<FreighterPlane> freighters = airport.getFreighters();
		ArrayList<String> fuel;
		Logic logic = new Logic();
		fuel = logic.findPlanesByFuel(passengers, freighters, 125, 200);

		for(PassengerPlane p : passengers){
			System.out.println(p.toString());
		}
		for(FreighterPlane f : freighters){
			System.out.println(f.toString());
		}
		System.out.println(" Total Seats = " + logic.totalSeats(passengers));
		
		System.out.println(" Total Capacity = " + logic.totalCapacity(freighters));
		
		System.out.println(" Fuel Consumption :");

		for(String s : fuel){
			System.out.println(" " + s);
		}
	}
}
