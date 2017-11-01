package plane;

public class PassangerPlane extends Plane {

	private int economyClassSeat;
	private int buisnessClassSeat;

	public PassangerPlane() {
	}

	public PassangerPlane(String name, int flyRange, int fuelConsumption,
			int flySpeed) {
		this.name = name;
		this.flyRange = flyRange;
		this.fuelConsumption = fuelConsumption;
		this.flySpeed = flySpeed;

	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" Economy Class = " + this.economyClassSeat
				+ " Buisness Class = " + this.buisnessClassSeat);
		return super.toString() + builder.toString();
	}

	public int getEconomyClassSeat() {
		return economyClassSeat;
	}

	public void setEconomyClassSeat(int economyClassSeat) {
		this.economyClassSeat = economyClassSeat;
	}

	public int getBuisnessClassSeat() {
		return buisnessClassSeat;
	}

	public void setBuisnessClassSeat(int buisnessClassSeat) {
		this.buisnessClassSeat = buisnessClassSeat;
	}

}
