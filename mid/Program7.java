import java.util.*;
public class Program7{
//6.Write two overloaded methods that return the average of an array with the 
//following headers: public static int average(int[] array) public static double average(double[] array) 
//Write a test program that prompts the user to enter ten double values, 
//invokes this method, and displays the average value.
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double[] a=new double[10];
		System.out.println("enter the 10 double values:");
		for(int i=0;i<10;i++) {
			a[i]=input.nextDouble();
		}
		double avg= average(a);
		System.out.println("Average:"+avg);
		input.close();
	}
	public static int average(int[] array) {
		int sum=0;
		for(int i:array) {
			sum+=i;
		}
		return sum/10;
	}
	public static double average(double[] array) {
		double sum=0;
		for(double i: array) {
			sum+=i;
		}
		return sum/10;
	}
}