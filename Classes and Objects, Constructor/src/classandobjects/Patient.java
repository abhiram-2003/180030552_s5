package classandobjects;
import java.util.*;
import java.util.Scanner;
public class Patient {
	 public static void main(String[] args) {
	        BMICalc();
	    }
	    public static void BMICalc() {
	        Scanner keyboard = new Scanner(System.in);
	        double height, weight, BMI;
	        System.out.print("Your height in m: ");
	        height = keyboard.nextDouble();
	        System.out.print("Your weight in kg: ");
	        weight = keyboard.nextDouble();
	        BMI = weight / (height * height);
	        System.out.println();
	        System.out.println("Your BMI is " + BMI);
	    }
}