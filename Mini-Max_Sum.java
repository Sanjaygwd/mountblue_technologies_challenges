import java.util.*;

public class Solution {
    public static void miniMaxSum(List<Long> arr) {
        // Sort the array
        Collections.sort(arr);
        
        // Calculate the minimum sum (sum of the first four numbers)
        long minSum = 0;
        for (int i = 0; i < 4; i++) {
            minSum += arr.get(i);
        }
        
        // Calculate the maximum sum (sum of the last four numbers)
        long maxSum = 0;
        for (int i = 1; i < 5; i++) {
            maxSum += arr.get(i);
        }
        
        // Print the results
        System.out.println(minSum + " " + maxSum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Long> arr = new ArrayList<>();
        
        // Read five integers
        for (int i = 0; i < 5; i++) {
            arr.add(scanner.nextLong());
        }
        
        // Call the miniMaxSum function
        miniMaxSum(arr);
        
        // Close the scanner
        scanner.close();
    }
}
