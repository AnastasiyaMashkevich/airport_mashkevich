package logic;

import plane.FreighterPlane;
import plane.PassangerPlane;
import java.util.ArrayList;

public class Logic {
	
	public ArrayList<String> findPlanesByFuel(ArrayList<PassangerPlane> passangers, ArrayList<FreighterPlane> freighters,
			int lowValue, int highValue){

		ArrayList<String> total = new ArrayList<String>();
		
		for(PassangerPlane pass: passangers){

			if ((pass.getFuelConsumption()>=lowValue)&&(pass.getFuelConsumption()<=highValue)){
				total.add("Name "+pass.getName()+" Fuel Consumption: "+pass.getFuelConsumption());
			}
		}

		for(FreighterPlane freigh: freighters){

			if ((freigh.getFuelConsumption()>=lowValue)&&(freigh.getFuelConsumption()<=highValue)){
				total.add("Name "+freigh.getName()+" Fuel Consumption: "+freigh.getFuelConsumption());
			}
		}
		return total;
	}

	public int totalSeats(ArrayList<PassangerPlane> passangers) {
		int tSeats = 0;
		for(PassangerPlane p : passangers ) {
			tSeats+=p.getBuisnessClassSeat()+p.getEconomyClassSeat();
		}
		return tSeats;
	}
	
	public int totalCapasity(ArrayList<FreighterPlane> Freighters) {
		int tCapasity = 0;
		for(FreighterPlane f : Freighters){
			
			tCapasity+=f.getBearingCapacity();
		}
		return tCapasity;
	}
	
	public ArrayList<RangeValue> RangeSort(ArrayList<PassangerPlane> passangers, ArrayList<FreighterPlane> freighters) {
		RangeComporator r = new RangeComporator();
		RangeValue rV;
		ArrayList<RangeValue> rVR = new ArrayList<RangeValue>();
		
		
		for(PassangerPlane p : passangers){
			
			rV = new RangeValue(p.getName(),p.getFlyRange());
			rVR.add(rV);
		}
		for(FreighterPlane f : freighters){
			
			rV = new RangeValue(f.getName(),f.getFlyRange());
			rVR.add(rV);
			
		}
		rVR.sort(r);
		return rVR;
	}
}
