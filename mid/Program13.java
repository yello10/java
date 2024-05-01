import java.util.*;
public class Program13 {
//12.	Write a program that prompts the user to enter the length of a square matrix, 
//randomly fills in 0s and 1s into the matrix, prints the matrix, and finds the rows, columns, and diagonals with all 0s or 1s. 
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the lenght of the square matrix:");
		int n=input.nextInt();
		int[][] a=new int[n][n];
		double threshold=0.5;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++) {
				a[i][j]=Math.random()<threshold ? 0 : 1;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.println(Arrays.toString(a[i]));
		}
		//checking rows for all 1s or 0s
		for(int i=0;i<n;i++) {
			boolean allZerosRows=true;
			boolean allOnesRows=true;
			for(int j=0;j<n;j++) {
				if(a[i][j]!=0) {
					allZerosRows=false;
				}
				if(a[i][j]!=1) {
					allOnesRows=false;
				}
			}
			if(allZerosRows) {
				System.out.println("Row"+i+"has all zeros");
			}
			if(allOnesRows){
				System.out.println("Row"+i+"has all ones");
			}
		}
		//checking if columns have all 1s or 0s
		for(int j=0;j<n;j++) {
			boolean allZerosCol=true;
			boolean allOnesCol=true;
			for(int i=0;i<n;i++) {
				if(a[i][j]!=0) {
					allZerosCol=false;
				}
				if(a[i][j]!=1) {
					allOnesCol=false;
				}
			}
			if(allZerosCol) {
				System.out.println("column"+j+"has all zeros");
			}
			if(allOnesCol){
				System.out.println("column"+j+"has all ones");
			}
		}
		//checking diagonals with all 1s or 0s
		boolean allZeroDia=true;
		boolean allOneDia=true;
		for(int i=0;i<n;i++) {
			if(a[i][i]!=0) {
				allZeroDia=false;
			}
			if(a[i][i]!=1) {
				allOneDia=false;
			}
		}
		if(allZeroDia) {
			System.out.println("diagonals are zeros");
		}
		if(allOneDia) {
			System.out.println("diagonal are ones");
		}
		//checking anti diagonals are 1s or 0s
		boolean allZeroAntiDia=true;
		boolean allOneAntiDia=true;
		for(int j=0;j<n;j++) {
			if(a[j][j]!=0) {
				allZeroAntiDia=false;
			}
			if(a[j][j]!=1) {
				allOneAntiDia=false;
			}
		}
		if(allZeroAntiDia) {
			System.out.println("anti diagonals are zeros");
		}
		if(allOneAntiDia) {
			System.out.println("anti diagonal are ones");
		}
		input.close();
	}

}
