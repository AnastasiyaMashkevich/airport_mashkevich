package bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "freighter")
public class FreighterPlane extends Plane {
	private int bearingCapacity;
	public FreighterPlane() {

	}

	public int getBearingCapacity() {
		return bearingCapacity;
	}

	public void setBearingCapacity(int bearingCapacity) {
		this.bearingCapacity = bearingCapacity;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" Capacity = " + this.bearingCapacity);
		return super.toString() + builder.toString();
	}
}
