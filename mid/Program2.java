import java.util.*;

////Write a program that finds the number of items above the average of all items.
public class Program2{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=input.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the items:");
		for(int i=0;i<n;i++) {
			a[i]=input.nextInt();
		}
		int sum=0;
		for(int num: a) {
			sum+=num;
		}
		double avg=sum/n;
		System.out.println("Average:"+avg);
		int count =0;
		for(int num:a) {
			if(num>avg) {
				count++;
			}
		}
		System.out.println("No. of items above average:"+count);
	}

}
