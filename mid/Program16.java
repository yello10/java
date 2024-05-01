import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program16 {
    // Method to split a string by the given regex delimiter, including the matching delimiters
    public static String[] split(String s, String regex) {
        // Create a list to hold the substrings and delimiters
        List<String> result = new ArrayList<>();
        
        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        
        // Variables to keep track of the current index and the last split point
        int lastIndex = 0;
        
        // Iterate through the string to find matches of the regex
        while (matcher.find()) {
            // Add the substring before the delimiter
            if (matcher.start() > lastIndex) {
                result.add(s.substring(lastIndex, matcher.start()));
            }
            
            // Add the matching delimiter
            result.add(s.substring(matcher.start(), matcher.end()));
            
            // Update the last index to continue from after the delimiter
            lastIndex = matcher.end();
        }
        
        // Add the remaining substring after the last delimiter
        if (lastIndex < s.length()) {
            result.add(s.substring(lastIndex));
        }
        
        // Convert the list to an array and return it
        return result.toArray(new String[0]);
    }

    // Test method
    public static void main(String[] args) {
        // Test the split method with different inputs
        String[] result1 = split("ab#12#453", "#");
        System.out.println("Split result 1:");
        for (String str : result1) {
            System.out.println(str);
        }

        String[] result2 = split("a?b?gf#e", "[?#]");
        System.out.println("\nSplit result 2:");
        for (String str : result2) {
            System.out.println(str);
        }
    }
}