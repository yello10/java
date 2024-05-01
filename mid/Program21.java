import java.io.*;
import java.util.*;
public class Program21 {

	public static void main(String[] args) throws Exception{
		Scanner input=new Scanner(new File("Example.txt"));
		int charCount=0;
		int wordCount=0;
		int lineCount=0;
		while(input.hasNext()) {
			String line = input.nextLine();
			charCount += line.replaceAll("\\s", "").length();
            wordCount += new StringTokenizer(line).countTokens();
            lineCount++;
		}
		System.out.println("Number of characters: " + charCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of lines: " + lineCount);
		input.close();
	}

}
