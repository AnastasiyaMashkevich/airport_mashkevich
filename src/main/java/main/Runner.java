package main;

import helper.XmlHelper;
import helper.exception.PlaneException;
import helper.logic.Logic;
import bean.Airport;
import bean.FreighterPlane;
import bean.PassengerPlane;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {

		XmlHelper xmlHelper = new XmlHelper();
		Airport airport = xmlHelper.getAirport();

		ArrayList<PassengerPlane> passengers = airport.getPassangers();
		ArrayList<FreighterPlane> freighters = airport.getFreighters();
		ArrayList<String> searchResults = null;
		Logic logic = new Logic();

		try {
			searchResults = logic.findPlanesByFuel(passengers, freighters, 100, 200);
		} catch (PlaneException e) {
			System.out.println(e.getMessage());
		}

		for(PassengerPlane passengerPlane : passengers){
			System.out.println(passengerPlane.toString());
		}
		for(FreighterPlane f : freighters) {
			System.out.println(f.toString());
		}
		System.out.println(" Total Seats = " + logic.totalSeats(passengers));
		
		System.out.println(" Total Capacity = " + logic.totalCapacity(freighters));

		if(searchResults != null)
			for(String result : searchResults){
			System.out.println("Plane: " + result);
		}
	}
}
