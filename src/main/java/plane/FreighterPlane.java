package plane;

public class FreighterPlane extends Plane {

	private int bearingCapacity;

	public FreighterPlane() {

	}

	public FreighterPlane(String name, int flyRange, int fuelConsumption, int flySpeed) {
		this.name = name;
		this.flyRange = flyRange;
		this.fuelConsumption = fuelConsumption;
		this.flySpeed = flySpeed;

	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" Capacity = " + this.bearingCapacity);
		return super.toString() + builder.toString();
	}

	public int getBearingCapacity() {
		return bearingCapacity;
	}

	public void setBearingCapacity(int bearingCapacity) {
		this.bearingCapacity = bearingCapacity;
	}

}
