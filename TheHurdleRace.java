import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // number of hurdles
        int k = in.nextInt(); // maximum height the character can jump naturally
        int[] height = new int[n];
        
        for(int height_i = 0; height_i < n; height_i++) {
            height[height_i] = in.nextInt();
        }
        
        // Find the tallest hurdle
        int maxHeight = height[0];
        for (int i = 1; i < n; i++) {
            if (height[i] > maxHeight) {
                maxHeight = height[i];
            }
        }
        
        // Calculate the number of doses needed
        int doses = Math.max(0, maxHeight - k);
        System.out.println(doses);
        
        in.close();
    }
}
