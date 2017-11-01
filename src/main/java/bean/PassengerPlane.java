package bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "passenger")
public class PassengerPlane extends Plane {
	private int economyClassSeat;
	private int businessClassSeat;

	public PassengerPlane() {
	}

	public int getEconomyClassSeat() {
		return economyClassSeat;
	}

	public void setEconomyClassSeat(int economyClassSeat) {
		this.economyClassSeat = economyClassSeat;
	}

	public int getBuisnessClassSeat() {
		return businessClassSeat;
	}

	public void setBuisnessClassSeat(int buisnessClassSeat) {
		this.businessClassSeat = buisnessClassSeat;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" Economy Class = " + this.economyClassSeat
				+ " Buisness Class = " + this.businessClassSeat);
		return super.toString() + builder.toString();
	}

}
