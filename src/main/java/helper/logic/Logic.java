package helper.logic;

import bean.Airport;
import bean.FreighterPlane;
import bean.PassengerPlane;
import bean.Plane;
import helper.XmlHelper;
import helper.exception.PlaneException;

import java.util.ArrayList;

public class Logic {
	
	public ArrayList<String> findPlanesByFuel(ArrayList<PassengerPlane> passengers, ArrayList<FreighterPlane> freighters,
											  int lowValue, int highValue) throws PlaneException {
		ArrayList<Plane> allPlanes = new ArrayList<>();
		ArrayList<String> results = new ArrayList<String>();
		allPlanes.addAll(passengers);
		allPlanes.addAll(freighters);
		for(Plane plane: allPlanes) {
			if ((plane.getFuelConsumption() >= lowValue) && (plane.getFuelConsumption() <= highValue)) {
				results.add("Name " + plane.getName() + "Fuel Consumption: " + plane.getFuelConsumption());
			}
		}
		if(results.size() == 0) {
			throw new PlaneException("We did not have any plane with set parameters.");
		}
		return results;
	}

	public int totalSeats(ArrayList<PassengerPlane> passengers) {
		int seatsCount = 0;
		for(PassengerPlane passengerPlane : passengers) {
			seatsCount += passengerPlane.getBuisnessClassSeat() + passengerPlane.getEconomyClassSeat();
		}
		return seatsCount;
	}
	
	public int totalCapacity(ArrayList<FreighterPlane> Freighters) {
		int capacity = 0;
		for(FreighterPlane freighterPlane : Freighters){
			capacity += freighterPlane.getBearingCapacity();
		}
		return capacity;
	}

	public void addPlane(Airport airport) {
		new XmlHelper().updateAirport(airport);
	}
}
