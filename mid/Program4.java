import java.util.*;
////binary search
public class Program4{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int n=input.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++) {
			a[i]=input.nextInt();
		}
		Arrays.sort(a);
		System.out.println("sorted array:"+Arrays.toString(a));
		System.out.print("enter the target element:");
		int target=input.nextInt();
		int index=Arrays.binarySearch(a,target);
		if(index>=0) {
			System.out.println("element found at index:"+index);
		}
		else {
			System.out.println("element not found");
		}
		input.close();
	}
}
