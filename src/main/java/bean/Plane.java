package bean;

import java.io.Serializable;

public abstract class Plane implements Serializable {
	protected String name;
	protected int fuelConsumption;
	protected int flySpeed;

	public Plane() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Override public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Plane plane = (Plane) o;

		if (fuelConsumption != plane.fuelConsumption)
			return false;
		if (flySpeed != plane.flySpeed)
			return false;
		return name.equals(plane.name);
	}

	@Override public int hashCode() {
		int result = name.hashCode();
		result = 31 * result + fuelConsumption;
		result = 31 * result + flySpeed;
		return result;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Name = " + this.name + " Fuel Consumption = " + this.fuelConsumption
				+ " flySpeed = " + this.flySpeed);
		return builder.toString();
	}

}
