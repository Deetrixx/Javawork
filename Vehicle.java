
public class Vehicle {
	private int noofWheels;
	private int noofDoors;
	private int carSeats;
	private String color;
	
	public Vehicle(int Wheels,int Doors,int seats,String color){
		this.noofWheels=Wheels;
		this.noofDoors=Doors;
		this.carSeats=seats;
		this.color=color;
	}
		public static void main (String [] args){
	Car bmw = new Car(4,4,5,"blue");
	
}
}
