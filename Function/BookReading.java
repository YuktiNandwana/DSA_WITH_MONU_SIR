package Function;
import java.util.Scanner;

public class BookReading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        
      
        int[] pagesPerDay = new int[7];
        for (int i = 0; i < 7; i++) {
            pagesPerDay[i] = scanner.nextInt();
        }
        
      
        int day = 0; 
        
        // Simulate the reading process
        while (n > 0) {
            n -= pagesPerDay[day]; 
            day = (day + 1) % 7; )
        }
        
        // Output the day when Petr finishes reading (1-based index)
        System.out.println((day == 0 ? 7 : day)); // Convert 0 (Monday) to 7 for output
    }
}
