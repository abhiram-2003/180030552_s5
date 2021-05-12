package classandobjects;
import java.io.*;
import java.util.*;
public class Patient {
	  String patientname;
	  double height;
	  double weight;
	  Patient(double pheight,double pweight){
	    height =pheight;
	    weight = pweight;
	  }
	  double Bmi() {
	    double value = ((weight/(height*height))*703);
	    return value;
	  }    
	  public static void main(String[] args) {
	    Patient p = new Patient(60,65.5);
	    System.out.println(p.Bmi());
	  }   
	}