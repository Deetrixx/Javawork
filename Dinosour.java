
public class Dinosour extends Animal {
	public static void sound(){
		System.out.println("I am roaring.");//overriding methods
	}
	public static void walk(String x){
		System.out.println(x);//overloading methods
	}
	public static void main (String [] args){
		Animal b= new Animal();
		Dinosour c=new Dinosour();
		b.sound();
		c.sound();
		b.walk();
		c.walk("I am running");
	}

}
