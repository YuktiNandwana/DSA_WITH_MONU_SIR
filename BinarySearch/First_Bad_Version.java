package BinarySearch;

public class First_Bad_Version {

    // Example isBadVersion function (replace with your actual implementation)
    private boolean isBadVersion(int version) {
        // Example: Assume version 4 and later are bad.
        return version >= 4;
    }

    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        int ans = n; // Initialize ans to n, in case no bad version is found.

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isBadVersion(mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        First_Bad_Version fbv = new First_Bad_Version();
        int firstBad = fbv.firstBadVersion(n);
        System.out.println("First bad version: " + firstBad);
    }
}