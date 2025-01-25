import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // Read the number of bird sightings
        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        // Read the bird type IDs and convert them into a list
        List<Integer> arr = new ArrayList<>();
        String[] sightings = bufferedReader.readLine().split(" ");
        for (String sighting : sightings) {
            arr.add(Integer.parseInt(sighting));
        }

        // Call the migratoryBirds function to find the most frequent bird type
        int result = migratoryBirds(arr);

        // Write the result to the output
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }

    // Function to find the most frequently sighted bird type
    public static int migratoryBirds(List<Integer> arr) {
        // Array to store the count of each bird type (from 1 to 5)
        int[] birdCount = new int[6];  // Using index 1-5, index 0 is unused

        // Count the occurrences of each bird type
        for (int bird : arr) {
            birdCount[bird]++;
        }

        // Find the bird type with the highest frequency
        int maxCount = 0;
        int resultBird = 0;

        for (int i = 1; i <= 5; i++) {
            if (birdCount[i] > maxCount) {
                maxCount = birdCount[i];
                resultBird = i;
            } else if (birdCount[i] == maxCount && i < resultBird) {
                resultBird = i; // Handle tie by selecting the smallest ID
            }
        }

        return resultBird;
    }
}
