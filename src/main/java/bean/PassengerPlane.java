package bean;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "passenger")
public class PassengerPlane extends Plane implements Serializable {
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

	@Override public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		if (!super.equals(o))
			return false;

		PassengerPlane that = (PassengerPlane) o;

		if (economyClassSeat != that.economyClassSeat)
			return false;
		return businessClassSeat == that.businessClassSeat;
	}

	@Override public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + economyClassSeat;
		result = 31 * result + businessClassSeat;
		return result;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" Economy Class = " + this.economyClassSeat
				+ " Buisness Class = " + this.businessClassSeat);
		return super.toString() + builder.toString();
	}

}
