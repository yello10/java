import java.util.*;
//random shuffling
public class Program1{
	public static void main(String[] agrs) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter the size of the array:");
		int n=input.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++) {
			a[i]=input.nextInt();
		}
		int [] shuffle=shuffling(a);
		System.out.println("Shuffled array:"+Arrays.toString(shuffle));
		input.close();
	}
	public static int[] shuffling(int[] array) {
		ArrayList<Integer> al=new ArrayList<>();
		for(int num : array) {
			al.add(num);
		}
		Collections.shuffle(al);
		int[] result=new int[al.size()];
		for(int i=0;i<al.size();i++) {
			result[i]=al.get(i);
		}
		return result;
	}
}
