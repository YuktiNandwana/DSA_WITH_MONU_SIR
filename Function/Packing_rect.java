package Function;
import java.util.Scanner;
public class Packing_rect {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int w = sc.nextInt();
	        int h = sc.nextInt();
	        int n = sc.nextInt();
	        long ans = 0;
	        long si = Math.max(w, h);
	        long ei = Math.max(w, h) * n;

	        while (si <= ei) {
	            long mid = si + (ei - si) / 2;
	            // Check if we can pack n rectangles of dimension w*h into a square of dimension mid*mid
	            if (canPack(w, h, n, mid)) {
	                ans = mid; // Update answer
	                ei = mid - 1; // Try for a smaller square
	            } else {
	                si = mid + 1; // Increase the size of the square
	            }
	        }
	        System.out.println(ans);
	    }

	    public static boolean canPack(int w, int h, int n, long m) {
	        long rows = m / h; // Number of rows that can fit
	        long cols = m / w; // Number of columns that can fit
	        return (rows * cols) >= n; // Check if total rectangles fit
	    }
	}