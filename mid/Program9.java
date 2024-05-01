import java.util.*;
public class Program9 {
//8. Write a method that returns a new array by eliminating the duplicate values 
//in the array using the following method header: public static int[] eliminateDuplicates(int[] list) 
//Write a test program that reads in ten integers, invokes the method, and displays the result.
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("ente the size of the array:");
		int len=input.nextInt();
		int[] a=new int[len];
		System.out.println("enter the elements:");
		for(int i=0;i<len;i++) {
			a[i]=input.nextInt();
		}
		int[] dup=eliminateDuplicates(a);
		System.out.println("Array without duplicate:"+Arrays.toString(dup));
		input.close();
	}
	public static int[] eliminateDuplicates(int[] list) {
		ArrayList<Integer>al=new ArrayList<>();
		for(int num:list) {
			if(!al.contains(num)) {
				al.add(num);
			}
		}
		int[] result=new int[al.size()];
		for(int i=0;i<al.size();i++) {
			result[i]=al.get(i);
		}
		return result;
	}
}
