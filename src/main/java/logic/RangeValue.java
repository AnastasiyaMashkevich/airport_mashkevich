package logic;

public class RangeValue {

	private String name;
	private int range;

	public RangeValue(String name, int range) {
		this.range = range;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

}
