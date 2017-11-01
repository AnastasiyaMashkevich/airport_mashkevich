package plane;

public abstract class Plane {

	protected String name;
	protected int flyRange;
	protected int fuelConsumption;
	protected int flySpeed;

	public String toString() {

		StringBuilder builder = new StringBuilder();

		builder.append("Name = " + this.name + " FlyRange = " + this.flyRange
				+ " Fuel Consumption = " + this.fuelConsumption
				+ " flySpeed = " + this.flySpeed);

		return builder.toString();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFlyRange() {
		return flyRange;
	}

	public void setFlyRange(int flyRange) {
		this.flyRange = flyRange;
	}

	public int getFuelConsumption() {
		return fuelConsumption;
	}

	public void setFuelConsumption(int fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}

	public int getFlySpeed() {
		return flySpeed;
	}

	public void setFlySpeed(int flySpeed) {
		this.flySpeed = flySpeed;
	}

}
