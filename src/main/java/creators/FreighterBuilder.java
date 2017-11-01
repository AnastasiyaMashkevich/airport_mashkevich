package creators;

import plane.FreighterPlane;
import plane.Plane;

public class FreighterBuilder extends Builder {
	
	FreighterPlane plane;
	
	public FreighterBuilder(){
		plane = new FreighterPlane();
	}

	@Override
	public Plane getPlane(String name, int... args) {
		plane.setName(name);
		plane.setFlyRange(args[0]);
		plane.setFuelConsumption(args[1]);
		plane.setFlySpeed(args[2]);
		plane.setBearingCapacity(args[3]);
		
		return plane;
	}

}
