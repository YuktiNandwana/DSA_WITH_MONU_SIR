public class freq_array {
    public static void main(String[] args) {
        String s = "gdccccnurljehgsidieljrkgneilrkgsrfjerfkpewofkeroferiarpo";
        int[] frq = new int[26];
        
        // Count frequency of each character
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            frq[ch - 'a']++; 
        }
        
        // Print frequencies
        for(int i = 0; i < frq.length; i++) {
            System.out.print(frq[i] + " ");
        }
    }
}