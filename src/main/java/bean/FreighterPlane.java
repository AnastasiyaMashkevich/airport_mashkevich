package bean;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement(name = "freighter")
public class FreighterPlane extends Plane implements Serializable {
	private int bearingCapacity;
	public FreighterPlane() {

	}

	public int getBearingCapacity() {
		return bearingCapacity;
	}

	public void setBearingCapacity(int bearingCapacity) {
		this.bearingCapacity = bearingCapacity;
	}

	@Override public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		if (!super.equals(o))
			return false;

		FreighterPlane that = (FreighterPlane) o;

		return bearingCapacity == that.bearingCapacity;
	}

	@Override public int hashCode() {
		int result = super.hashCode();
		result = 31 * result + bearingCapacity;
		return result;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(" Capacity = " + this.bearingCapacity);
		return super.toString() + builder.toString();
	}
}
