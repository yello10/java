import java.util.*;
public class Program5 {
//linear searching
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("ente the size of the array:");
		int len=input.nextInt();
		int[] a=new int[len];
		System.out.println("enter the elements:");
		for(int i=0;i<len;i++) {
			a[i]=input.nextInt();
		}
		Arrays.sort(a);
		System.out.println("sorted array:"+Arrays.toString(a));
		System.out.println("enter the target:");
		int target=input.nextInt();
		for(int i=0;i<len;i++) {
			if(a[i]==target) {
				System.out.println("Found at:"+i);
			}
		}
		System.out.println("Not found");
		input.close();
	}
}