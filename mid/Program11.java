import java.util.*;
public class Program11 {
//10.The arrays list1 and list2 are strictly identical if their corresponding elements are equal. 
//Write a method that returns true if list1 and list2 are strictly identical, 
//using the following header: public static boolean equals(int[] list1, int[] list2) 
//Write a test program that prompts the user to enter two lists of integers and displays 
//whether the two are strictly identical.
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the size of first array:");
		int n=input.nextInt();
		int[] a1=new int[n];
		System.out.println("enter the size of second array:");
		int m=input.nextInt();
		int[] a2=new int[m];
		System.out.println("Enter the values of the first array:");
		for(int i=0;i<n;i++) {
			a1[i]=input.nextInt();
		}
		System.out.println("Enter the values of the second array:");
		for(int i=0;i<m;i++) {
			a2[i]=input.nextInt();
		}
		boolean equal=equals(a1,a2);
		if(equal==true) {
			System.out.println("list1 and list2 are strictly identical");
		}
		else if(equal == false) {
			System.out.println("not equal");
		}
		input.close();
	}
	public static boolean equals(int[] list1, int[] list2) {
		ArrayList<Integer> al1=new ArrayList<>();
		for(int num: list1) {
			al1.add(num);
		}
		ArrayList<Integer> al2=new ArrayList<>();
		for(int num: list2) {
			al2.add(num);
		}
		if(al1.size()!=al2.size()) {
			return false;
		}
		for(int i=0;i<al1.size();i++) {
			if(!Objects.equals(al1.get(i), al2.get(i))) {
				return false;
			}
		}
		return true;
	}
}
