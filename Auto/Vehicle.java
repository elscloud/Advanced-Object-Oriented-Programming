package Auto;

public class Vehicle {
	public int tire;
	public int machine;
	
	public Vehicle(int tire, int machine) {
		this.tire = tire;
		this.machine = machine;
	}

	public int getTire() {
		return tire;
	}

	public void applyTire(int decrement){
		tire -= decrement;
	}
	public void speedUp(int increment){
		machine += increment;
	}
	public String toString(){
		return("No of tire needs are "+tire+"\n"+"the max Speed of car is "+machine+" kmph");
	}
	
}
