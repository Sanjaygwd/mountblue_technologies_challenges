import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 3 == 0 && s.charAt(i) != 'S') {
                count++;
            } else if (i % 3 == 1 && s.charAt(i) != 'O') {
                count++;
            } else if (i % 3 == 2 && s.charAt(i) != 'S') {
                count++;
            }
        }
        System.out.println(count);
        in.close();
    }
}
