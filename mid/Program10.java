import java.util.*;
public class Program10 {
//9. Write a program that randomly generates an array of 100,000 integers and a key. 
//Estimate the execution time of invoking the linearSearch method.
//Sort the array and estimate the execution time of invoking the binarySearch method. 
//You can use the following code template to obtain the execution time:  long startTime = System.currentTimeMillis();
//perform the task; long endTime = System.currentTimeMillis(); long executionTime = endTime - startTime;
	public static void main(String[] args) {
		//randomly generating an array of 100000 integers
		int[] a=new int[100000];
		for(int i=0;i<100000;i++) {
			a[i]=(int)(Math.random()*100000);
		}
		//randomly generating key
		int key=(int)(Math.random()*100000);
		
		//calculation of execution time in linear search
		long startTimeLinear=System.currentTimeMillis();
		linearSearch(a,key);
		long endTimeLinear=System.currentTimeMillis();
		long exectionTimeLinear=endTimeLinear-startTimeLinear;
		System.out.println("linear search execution time:"+exectionTimeLinear);
		
		//calculation of execution time in binary search
		long startTimeBinary=System.currentTimeMillis();
		binarySearch(a,key);
		long endTimeBinary=System.currentTimeMillis();
		long exectionTimeBinary=endTimeBinary-startTimeBinary;
		System.out.println("binary search execution time:"+exectionTimeBinary);
	}
	public static int linearSearch(int[]a,int key) {
		for(int i=0;i<100000;i++) {
			if(a[i]==key) {
				return i;
			}
		}
		return -1;
	}
	
	public static int binarySearch(int[] a,int key) {
		Arrays.sort(a);
		int index=Arrays.binarySearch(a, key);
		if(index>=0) {
			return index;
		}
		else {
			return -1;
		}
	}
}
