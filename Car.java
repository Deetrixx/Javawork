
public class Car {
	public static void start(){
		System.out.println("Ignition has been initiated!");
	}
	public static void stop(){
		System.out.println("Car is stoping!");
	}
	public static String Accelerate(int speed){
		if(speed>80){
			return "Overspeeding!Be carefull";
		} else{
		return "Careful driving!";
		}
	}
	public static String Accelerate(int speed,int fuel){
		if(speed>100){
			if(fuel<8){
				return "Overspeeding and Fuel is low.";
			}			
			else{
				return "Fuel is ok but, Your driving stupidly";
			}
		} else{
		return "Careful driving but check your fuel consumption.";
		}
	}
	}
