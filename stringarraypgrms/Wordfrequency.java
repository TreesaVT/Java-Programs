package stringarraypgrms;

public class Wordfrequency // Word frequency
{
    public static void main(String[] args) {
        String input = "Java is easy and Java is powerful";

        // Step 1: Convert to lowercase and split into words
        String[] words = input.toLowerCase().split(" ");

        // Step 2: Create arrays to track unique words and their counts
        String[] uniqueWords = new String[words.length];
        int[] counts = new int[words.length];
        int uniqueCount = 0;

        // Step 3: Loop through each word in the input
        for (String word : words) {
            boolean found = false;

            // Step 4: Check if the word already exists in uniqueWords
            for (int i = 0; i < uniqueCount; i++) {
                if (uniqueWords[i].equals(word)) {
                    counts[i]++; // word already exists → increase its count
                    found = true;
                    break;
                }
            }

            // Step 5: If word is not found, add it to the uniqueWords array
            if (!found) {
                uniqueWords[uniqueCount] = word;
                counts[uniqueCount] = 1;
                uniqueCount++;
            }
        }

        // Step 6: Print the result
        for (int i = 0; i < uniqueCount; i++) {
            System.out.println(uniqueWords[i] + " : " + counts[i]);
        }
    }
}


