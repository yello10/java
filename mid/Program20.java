import java.util.*;
import java.io.*;
//19.Write a program that removes all the occurrences of a specified string from a text file. 
public class Program20 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(new File("Example.txt"));
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to remove:");
        String str = sc.next();
        FileWriter fw= new FileWriter("Output.txt");
        while (input.hasNext()) {
            String word = input.next();
            if (!word.equals(str)) {
                fw.write(word + " ");
            }
        }
        fw.close();
        input.close();
        sc.close();
    }
}
