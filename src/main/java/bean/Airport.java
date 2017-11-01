package bean;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement(name = "airport")
public class Airport {

	public ArrayList<PassengerPlane> passenger;
	public ArrayList<FreighterPlane> freighter;

	public static Airport instance;

	public ArrayList<PassengerPlane> getPassangers() {
		return passenger;
	}

	public void setPassengers(ArrayList<PassengerPlane> passangers) {
		this.passenger = passangers;
	}

	public ArrayList<FreighterPlane> getFreighters() {
		return freighter;
	}

	public void setFreighters(ArrayList<FreighterPlane> freighters) {
		this.freighter = freighters;
	}

}
