package practiceproblems;
import java.io.*;
import java.util.*;
public class P8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char a  = sc.next().charAt(0);
    switch(a) {
      case 'R':
        System.out.println("Red");
        break;
      case 'B':
        System.out.println("blue");
        break;
      case 'G':
        System.out.println("green");
        break;
      case 'O':
        System.out.println("Orange");
        break;
      case 'Y':
        System.out.println("Yellow");
        break;
      case 'W':
        System.out.println("white");
        break;
    }
  }

}