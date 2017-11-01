package creators;

import plane.Plane;

public abstract class Builder {
	public abstract Plane getPlane(String name, int...args);
}
