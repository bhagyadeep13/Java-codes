package dynamic_programming;

import java.util.Scanner;

public class b {

    // Method to print all permutations of the string
    public static void permute(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                String rest = str.substring(0, i) + str.substring(i + 1);
                permute(rest, prefix + ch);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to permute: ");
        String input = scanner.nextLine();
        System.out.println("Permutations of " + input + " are:");
        permute(input, "");
        scanner.close();
    }
}
