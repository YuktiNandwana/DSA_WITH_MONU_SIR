package Strings;

import java.util.Scanner;

public class Find_Cb_Number {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the string: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        substring(str);
        sc.close();
    }

    
    // Method to find valid substrings
    public static void substring(String str) {
        int count = 0;
        boolean[] visited = new boolean[str.length()];

        for (int length = 1; length <= str.length(); length++) {
            for (int j = length; j <= str.length(); j++) {
                int i = j - length;
                String s = str.substring(i, j); // Corrected variable name
                Long num = Long.parseLong(s); // Changed variable name to num

                if (IsCbNumber(num) && !IsVisited(visited, i, j - 1)) {
                    count++;
                    for (int k = i; k < j; k++) {
                        visited[k] = true; // Marked as visited
                    }
                }
            }
        }
        System.out.println("Count of valid CB numbers: " + count);
    }

    
    // Method to check if a number is a CB number
    public static boolean IsCbNumber(long nums) {
        if (nums == 0 || nums == 1) {
            return false;
        }
        int[] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29}; // Store all CB numbers
        for (int prime : arr) {
            if (nums == prime) {
                return true; // They are all CB numbers
            }
        }
        for (int prime : arr) {
            if (nums % prime == 0) {
                return false; // Not a CB number
            }
        }
        return true; // It is a CB number
    }

    
    // Method to check if a substring has been visited
    public static boolean IsVisited(boolean[] visited, int i, int j) {
        for (int k = i; k <= j; k++) {
            if (visited[k]) {
                return true; // Overlap found
            }
        }
        return false; // No overlap
    }
}

