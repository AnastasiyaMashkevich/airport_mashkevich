package logic;

import bean.FreighterPlane;
import bean.PassengerPlane;
import java.util.ArrayList;

public class Logic {
	
	public ArrayList<String> findPlanesByFuel(ArrayList<PassengerPlane> passangers, ArrayList<FreighterPlane> freighters,
											  int lowValue, int highValue){
		ArrayList<String> total = new ArrayList<String>();
		for(PassengerPlane pass: passangers){
			if ((pass.getFuelConsumption()>=lowValue)&&(pass.getFuelConsumption()<=highValue)){
				total.add("Name " + pass.getName() + "Fuel Consumption: " + pass.getFuelConsumption());
			}
		}

		for(FreighterPlane freight: freighters){
			if ((freight.getFuelConsumption()>=lowValue)&&(freight.getFuelConsumption()<=highValue)){
				total.add("Name " + freight.getName()+" Fuel Consumption: " + freight.getFuelConsumption());
			}
		}
		return total;
	}

	public int totalSeats(ArrayList<PassengerPlane> passengers) {
		int seatsCount = 0;
		for(PassengerPlane p : passengers ) {
			seatsCount += p.getBuisnessClassSeat() + p.getEconomyClassSeat();
		}
		return seatsCount;
	}
	
	public int totalCapacity(ArrayList<FreighterPlane> Freighters) {
		int capacity = 0;
		for(FreighterPlane f : Freighters){

			capacity += f.getBearingCapacity();
		}
		return capacity;
	}
}
