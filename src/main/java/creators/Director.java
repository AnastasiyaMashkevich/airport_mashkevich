package creators;

import plane.Plane;

public class Director {
	private Builder builder;
	
	public Director(String plane){
		if (plane.equals("Freighter")){
			builder = new FreighterBuilder();			
		} else if (plane.equals("Passanger")){
			builder = new PassangerBuilder();
				} else {
			throw new IllegalArgumentException();
		}
		
	}
	
	public Plane getPlane(String name, int...args){
		
		return builder.getPlane(name, args);
	}
}
