package classandobjects;
import java.io.*;
import java.util.*;
import java.math.*;
public class Calculator {
	  static double powerInt(int num1,int num2) {
	    return  Math.pow(num1,num2);
	    }
	  static double powerDouble(double num1,int num2) {
	    return Math.pow(num1,num2);
	  }
	  public static void main(String[] args) {
	    System.out.println(Calculator.powerDouble(70.0, 2));
	      System.out.println(Calculator.powerInt(120,3));
	  }
	}