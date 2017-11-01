package creators;

import plane.Airport;
import plane.FreighterPlane;
import plane.PassangerPlane;

import java.util.ArrayList;

public class DataAirport {
	
	private Airport airport;
	private ArrayList<PassangerPlane> passangers;
	private ArrayList<FreighterPlane> freighters;
	private Director director;
	private Director director2;
	private Director director3;
	
	public DataAirport(){
		passangers = new ArrayList<PassangerPlane>();
		freighters = new ArrayList<FreighterPlane>();
		airport = Airport.getAirportInstance();
		
	}

public void create(){
	
	String type = "Passanger";	
	String name = "boing 747 ";
	int flyRange = 10000;
	int fuelConsumption = 125;
	int flySpeed = 6000;
	int economyClassSeat = 235;
	int buisnessClassSeat = 75;
	
	String type2 = "Passanger";
	String name2 = "aerobus 44 ";
	int flyRange2 = 8600;
	int fuelConsumption2 = 165;
	int flySpeed2 = 5450;
	int economyClassSeat2 = 200;
	int buisnessClassSeat2 = 40;
	
	String type3 = "Freighter";	
	String name3 = "Freighter";
	int flyRange3 = 16000;
	int fuelConsumption3 = 188;
	int flySpeed3 = 6060;
	int bearingCapacity3 = 800;
	
	
	director = new Director(type);
	passangers.add((PassangerPlane) director.getPlane(name,flyRange,fuelConsumption,flySpeed,economyClassSeat,buisnessClassSeat));
	director2 = new Director(type2);
	passangers.add((PassangerPlane) director2.getPlane(name2,flyRange2,fuelConsumption2,flySpeed2,economyClassSeat2,buisnessClassSeat2));
	director3 = new Director(type3);
	freighters.add((FreighterPlane) director3.getPlane(name3, flyRange3,fuelConsumption3,flySpeed3,bearingCapacity3));
	
	airport.setFreighters(freighters);
	airport.setPassangers(passangers);
	}
}
