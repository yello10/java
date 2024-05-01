import java.util.*;
import java.io.*;
public class Program23 {
//22.	Write a program to create a file named Exercise12_15.txt if it does not exist. 
//Write 100 integers created randomly into the file using text I/O. Integers are separated by spaces in the file. 
//Read the data back from the file and display the data in increasing order.
	public static void main(String[] args) throws IOException{
		File f=new File("hi.txt");
		if(f.createNewFile()) {
			System.out.println("created a file "+f.getAbsolutePath());
		}
		else {
			System.out.println("file already exists"+f.getName());
		}
		FileWriter fw= new FileWriter(f);
		for(int i=0;i<100;i++) {
			int random=(int)(Math.random()*1000);
			fw.write(Integer.toString(random));
			fw.write(" ");
		}
		fw.close();
		int[] a=new int[100];
		Scanner input=new Scanner(new File("hi.txt"));
		for(int i=0;i<100;i++) {
			a[i]=input.nextInt();
		}
		Arrays.sort(a);
		System.out.println("in decresing order:"+Arrays.toString(a));
		input.close();
	}

}
