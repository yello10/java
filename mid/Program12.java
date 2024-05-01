import java.util.*;
public class Program12 {
//11. Suppose the weekly hours for all employees are stored in a two-dimensional array. 
//Each row records an employee’s seven-day work hours with seven columns. 
//For example, the following array stores the work hours for eight employees. 
//Write a program that displays employees and their total hours in decreasing order of the total hours. 
//Suppose the weekly hours for all employees are stored in a two-dimensional array. 
//Each row records an employee’s seven-day work hours with seven columns. 
//For example, the following array stores the work hours for eight employees. 
//Write a program that displays employees and their total hours in decreasing order of the total hours. 
	public static void main(String[] args) {
		int[][] a=new int[8][7];
		int[] totalHours=new int[8];
		for(int i=0;i<8;i++) {
			int total=0;
			for(int j=0;j<7;j++) {
				a[i][j]=(int)(Math.random()* 11);
				total+=a[i][j];
			}
			totalHours[i]=total;
		}
		for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                if (totalHours[i] > totalHours[j]) {
                    int temp = totalHours[i];
                    totalHours[i] = totalHours[j];
                    totalHours[j] = temp;

                    int[] tempArray = a[i];
                    a[i] = a[j];
                    a[j] = tempArray;
                }
            }
        }

        // Display employees and their total hours
        System.out.println("Employees and their total work hours in decreasing order:");
        for (int i = 0; i < 8; i++) {
            System.out.println("Employee " + (i + 1) + ": " + Arrays.toString(a[i]) + ", Total Hours: " + totalHours[i]);
        }
    }
}
