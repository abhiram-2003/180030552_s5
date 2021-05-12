package classandobjects;
import java.io.*;
import java.util.*;
public class Box {
  int l;
  int b;
  int h;
    Box(int length,int width,int height) {
      l = length;
      b = width;
      h = height;
    }
    int volume() {
      int volume = l*b*h;
      return volume;
    }
  public static void main(String[] args) {
    Box b1 = new Box(10,20,30);
    int c = b1.volume();
    System.out.println(c);
  }
}