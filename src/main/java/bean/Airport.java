package bean;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;

@XmlRootElement(name = "airport")
public class Airport implements Serializable {

	public ArrayList<PassengerPlane> passenger;
	public ArrayList<FreighterPlane> freighter;

	public ArrayList<PassengerPlane> getPassangers() {
		return passenger;
	}

	public void setPassengers(ArrayList<PassengerPlane> passengers) {
		this.passenger = passengers;
	}

	public ArrayList<FreighterPlane> getFreighters() {
		return freighter;
	}

	public void setFreighters(ArrayList<FreighterPlane> freighters) {
		this.freighter = freighters;
	}

}
