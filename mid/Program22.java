import java.util.*;
import java.io.*;
public class Program22 {

	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the file name:");
		String fileName=sc.next();
		
		Scanner input=new Scanner(new File(fileName));
		int sum=0;
		int count=0;
		while(input.hasNext()) {
			int score=input.nextInt();
			sum+=score;
			count++;
		}
		double avg=(double)sum/count;
		System.out.println("Total:"+sum);
		System.out.println("Average:"+avg);
		input.close();
		sc.close();
	}

}
