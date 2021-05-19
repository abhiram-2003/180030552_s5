package practiceproblems;
import java.io.*;
import java.util.*;
public class P16 {
	public static void main(String[] args) {
		System.out.println("Please enter an integer number");
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}
}