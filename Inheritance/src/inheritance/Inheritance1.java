package inheritance;
import java.io.*;
class Animal {
	 void eat()
	 {
	  System.out.println("Eat method from Animal class");
	 }
	 void sleep()
	 {
	  System.out.println("Sleep method from Animal Class");
	 }
	}
	class Bird extends Animal
	{
	 void eat()
	 {
	  System.out.println("Eat method from Bird class");
	 }
	 void sleep()
	 {
	  System.out.println("Sleep method from Bird Class");
	 }
	 void fly()
	 {
	  System.out.println("Bird Flying....");
	 }
	}
	public class Inheritance1{
	 public static void main(String[] args) {
	  Animal a=new Animal();
	  a.eat();
	  a.sleep();
	  Bird b=new Bird();
	  b.eat();
	  b.sleep();
	  b.fly();
	 }
	}