import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FrogCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine(); // Read the input string
        int n = sc.nextInt(); // Read the number of start indices
        int[] startIndices = new int[n];
        for (int i = 0; i < n; i++) {
            startIndices[i] = sc.nextInt(); // Read start indices
        }
        
        int m = sc.nextInt(); // Read the number of end indices
        int[] endIndices = new int[m];
        for (int i = 0; i < m; i++) {
            endIndices[i] = sc.nextInt(); // Read end indices
        }
        
        List<Integer> results = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            int startIndex = startIndices[i] - 1; // Convert to 0-based index
            int endIndex = endIndices[i] - 1; // Convert to 0-based index
            
            if (s.charAt(startIndex) == '|' && s.charAt(endIndex) == '|') {
                int frogCount = countFrogs(s, startIndex, endIndex);
                results.add(frogCount);
            } else {
                results.add(0); // Invalid range
            }
        }
        
        // Print the results
        for (int count : results) {
            System.out.println(count);
        }
    }
    
    private static int countFrogs(String s, int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (s.charAt(i) == '*') {
                count++;
            }
        }
        return count;
    }
}
