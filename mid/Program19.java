import java.util.*;
public class Program19 {
//18.	Write a program that meets the following requirements:
//Creates an array with 100 randomly chosen integers. 
//Prompts the user to enter the index of the array, then displays the corresponding element value. 
//If the specified index is out of bounds, display the message Out of Bounds.

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] a=new int[100];
		for(int i=0;i<100;i++) {
			a[i]=(int)(Math.random()*100);
		}
		System.out.println("array:");
		System.out.println(Arrays.toString(a));
		System.out.println("Enter index:");
		int index=input.nextInt();
		try {
			System.out.println("element at index "+index+":"+a[index]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of Bounds");
		}
		input.close();
	}

}
