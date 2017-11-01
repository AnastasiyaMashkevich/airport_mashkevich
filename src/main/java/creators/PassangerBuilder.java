package creators;

import plane.PassangerPlane;
import plane.Plane;

public class PassangerBuilder extends Builder {

	PassangerPlane plane;
	
	public PassangerBuilder(){
		plane = new PassangerPlane();
	}
	
	
	@Override
	public Plane getPlane(String name, int... args) {
		
		plane.setName(name);
		plane.setFlyRange(args[0]);
		plane.setFuelConsumption(args[1]);
		plane.setFlySpeed(args[2]);
		plane.setBuisnessClassSeat(args[3]);
		plane.setEconomyClassSeat(args[4]);
		
		return plane;
	}

}
