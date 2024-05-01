import java.util.*;
public class Program8 {
//7.Write a method that finds the smallest element in an array of double values using the following header: 
//public static double min(double[] array) Write a test program that prompts the user to enter ten numbers, 
//invokes this method to return the minimum value, and displays the minimum value
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double[] a=new double[10];
		System.out.println("Enter the 10 double values:");
		for(int i=0;i<10;i++) {
			a[i]=input.nextDouble();
		}
		double minimum =min(a); 
		System.out.println("Minimum value:"+minimum);
		input.close();
	}
	public static double min(double[] array) {
		Arrays.sort(array);
		return array[0];
	}
	
}
