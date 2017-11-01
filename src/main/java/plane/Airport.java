package plane;

import java.util.ArrayList;

public class Airport {
	
	public ArrayList<PassangerPlane> passangers;
	public ArrayList<FreighterPlane> freighters;
	public static Airport instance;
	
	public static synchronized Airport getAirportInstance() {
		if (instance == null) {
			instance = new Airport();
		}
		return instance;

	}
	
	public ArrayList<PassangerPlane> getPassangers() {
		return passangers;
	}

	public void setPassangers(ArrayList<PassangerPlane> passangers) {
		this.passangers = passangers;
	}

	public ArrayList<FreighterPlane> getFreighters() {
		return freighters;
	}

	public void setFreighters(ArrayList<FreighterPlane> freighters) {
		this.freighters = freighters;
	}

}
