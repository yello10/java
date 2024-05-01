import java.util.*;
public class Program3 {
// Write a program to count the occurrences of each letter in an array of characters.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of characters:");
        int len = input.nextInt();
        char[] a = new char[len];
        System.out.println("Enter the characters:");
        for (int i = 0; i < len; i++) {
            a[i] = input.next().charAt(0);
        }
        Arrays.sort(a); 
        System.out.println();
        for (int i = 0; i < len; i++) {
            int count = 1;
            while (i + 1 < len && a[i] == a[i + 1]) {
                count++;
                i++;
            }
            System.out.println(a[i] + " -> " + count);
        }
        input.close();
    }

}
