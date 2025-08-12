// end = window ka right pointer (hum new character add karte ja rahe hain)

// start = window ka left pointer (hum old characters remove karte hain agar allowed changes se zyada ho jaaye)

// ch = target character (ya 'a' ya 'b')

// count = kitne characters window ke andar aise hain jo ch nahi hain (matlab jinhe change karna padega)

import java.util.Scanner;
public class KartikBhaiya_And_Strings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s = sc.next();
        
        int ans = Math.max(maxLengthWithChar(s, k, 'a'), 
                           maxLengthWithChar(s, k, 'b'));
        System.out.println(ans);
    }

    static int maxLengthWithChar(String s, int k, char target) {
        int start = 0, maxLen = 0, diffCount = 0;

        for (int end = 0; end < s.length(); end++) {
            if (s.charAt(end) != target) diffCount++; // change required

            while (diffCount > k) {
                if (s.charAt(start) != target) diffCount--;
                start++;
            }

            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }
