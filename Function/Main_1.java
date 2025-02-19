package Function;

public class Main_1{
	import java.util.HashSet;
	import java.util.Scanner;
	import java.util.Set;
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Read the number of points
	        int n = scanner.nextInt();
	        Set<Point> points = new HashSet<>();
	        
	        // Read the points and store them in a set
	        for (int i = 0; i < n; i++) {
	            int x = scanner.nextInt();
	            int y = scanner.nextInt();
	            points.add(new Point(x, y));
	        }
	        
	        int supercentralCount = 0;
	        
	        // Check each point for supercentral conditions
	        for (Point p : points) {
	            boolean hasUpper = false;
	            boolean hasLower = false;
	            boolean hasLeft = false;
	            boolean hasRight = false;
	            
	            for (Point neighbor : points) {
	                if (p.equals(neighbor)) continue; // Skip the same point
	                
	                if (neighbor.x == p.x) {
	                    if (neighbor.y > p.y) hasUpper = true; // Upper neighbor
	                    if (neighbor.y < p.y) hasLower = true; // Lower neighbor
	                }
	                if (neighbor.y == p.y) {
	                    if (neighbor.x > p.x) hasRight = true; // Right neighbor
	                    if (neighbor.x < p.x) hasLeft = true; // Left neighbor
	                }
	            }
	            
	            // Check if the point is supercentral
	            if (hasUpper && hasLower && hasLeft && hasRight) {
	                supercentralCount++;
	            }
	        }
	        
	        // Output the number of supercentral points
	        System.out.println(supercentralCount);
	    }
	    
	    // Point class to represent a point in 2D space
	    static class Point {
	        int x, y;
	        
	        Point(int x, int y) {
	            this.x = x;
	            this.y = y;
	        }
	        
	        @Override
	        public boolean equals(Object obj) {
	            if (this == obj) return true;
	            if (obj == null || getClass() != obj.getClass()) return false;
	            Point point = (Point) obj;
	            return x == point.x && y == point.y;
	        }
	        
	        @Override
	        public int hashCode() {
	            return 31 * x + y; // Simple hash function
	        }
	    
	}
}
