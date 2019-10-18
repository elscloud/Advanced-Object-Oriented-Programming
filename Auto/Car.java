package Auto;

public class Car extends Vehicle {
	public int totalTire;

	public Car(int tire, int machine, int totalTire) {
		super(tire, machine);
		this.totalTire = totalTire;
	}
	
	public void setTire(int newValue){
		totalTire= newValue;
	}
	public String toString(){
		return(super.toString()+"\nTotal tire is "+totalTire);
	}
	public static void main(String args[]){
		Car Honda = new Car(4,200,4);
		System.out.println(Honda);
	}
	
}
