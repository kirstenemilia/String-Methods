import java.util.Scanner;

public class StringLab 
{
    public static void main(String[] args)
    {
        String str = " Welcome to the Java String lab! "; // Task 1: Working with string methods
        System.out.println("Original string: \"" + str + "\"");

        System.out.println("Length: " + str.length()); //length

        System.out.println("Character at index 7: " + str.charAt(7)); // Character at index 7

        int startIndex = str.indexOf("Java");
        int endIndex = startIndex + "Java".length();
        System.out.println("Substring 'Java': " + str.substring(startIndex, endIndex)); // Substring extract Java

        System.out.println("Uppercase: " + str.toUpperCase()); // Uppercase
        System.out.println("Lowercase: " + str.toLowerCase()); // Lowercase

        System.out.println("Index of first 'Java': " + str.indexOf("Java")); // Print index of first 'Java'

        System.out.println("Contains the word 'Lab': " + str.contains("Lab")); // Check if contains Lab and print result

        String replacedStr = str.replace("Java", "Java Programming"); // Replaces Java with Java Programming
        System.out.println("After replacing: " + replacedStr); 

        String[] words = str.trim().split(" "); // Split
        System.out.println("Split words: ");
        for (String word : words)
        {
            System.out.println(word); 
        }

        System.out.println("Trimmed string: |" + str.trim() + "|"); // Trim string

        String compStr = "java string lab!"; 
        System.out.println("equals(): " + compStr.equals(str)); // equals
        System.out.println("equalsIgnoreCase(): " + compStr.equalsIgnoreCase(str.trim())); // equalsIgnoreCase


        System.out.println("| Task 2 - Loop Challenges with Strings |");

        int vowelCount = 0; // Count vowels
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < str.length(); i++)
        {
            if (vowels.indexOf(str.charAt(i)) != -1) // 'If current character found in vowels string'
            {
                vowelCount++; // Increment vowel count
            }
        }
        System.out.println("Number of vowels in original string: " + vowelCount);

        String word = "racecar"; // Palindrome
        int left = 0;
        int right = word.length() - 1;
        boolean isPalindrome = true;
        while (left < right)
        {
            if (word.charAt(left) != word.charAt(right))
            {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        System.out.println("Is " + word + " a palindrome? " + isPalindrome);

        Scanner scanner = new Scanner(System.in); //Do While task
        String userInput;
        do
        {
            System.out.print("Enter a sentence containing the word 'Java': "); 
            userInput = scanner.nextLine();
        }
        while (!userInput.contains("Java"));
        System.out.println("Thank you!");

        System.out.println("| Task 3 - Working with StringBuilder |");

        StringBuilder sb = new StringBuilder("StringBuilder Lab");
        System.out.println("Original StringBuilder: " + sb);

        sb.append("- Learning Java"); // append()
        System.out.println("After append: " + sb);

        int labIndex = sb.indexOf("Lab"); // insert()
        sb.insert(labIndex + "Lab".length(), " is fun");
        System.out.println("After insert: " + sb);

        int learningStart = sb.indexOf("Learning"); 
        if (learningStart != -1)
        {
            sb.delete(learningStart, learningStart + "Learning".length()); // delete()
        }
        System.out.println("After delete: " + sb);

        sb.reverse(); // reverse()
        System.out.println("After reverse: " + sb);

        System.out.println("| Task 4 - Working with StringBuffer |");

        StringBuffer sbuff = new StringBuffer("Multithreading Lab");
        System.out.println("Original StringBuffer: " + sbuff);

        sbuff.append("- Learning Java"); // append()
        System.out.println("After append: " + sbuff);

        int labIndexBuf = sbuff.indexOf("Lab"); // insert()
        sbuff.insert(labIndexBuf + "Lab".length(), " is fun");
        System.out.println("After insert: " + sbuff);

        int learningStartBuf = sbuff.indexOf("Learning"); 
        if (learningStartBuf != -1)
        {
            sbuff.delete(learningStartBuf, learningStartBuf + "Learning".length()); // delete()
        }
        System.out.println("After delete: " + sbuff);

        sbuff.reverse(); // reverse()
        System.out.println("After reverse: " + sbuff);

        scanner.close();
    }
}












       

        












    
