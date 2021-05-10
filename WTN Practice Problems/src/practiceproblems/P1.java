package practiceproblems;
import java.io.*;
import java.util.*;
public class P1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    if(a<0) {
      System.out.println("Negative number");
    }else if(a == 0) {
      System.out.println("Zero");
    }else {
      System.out.println("Positive number");
    }

  }

}
