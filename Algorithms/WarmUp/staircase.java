import java.io.*;

class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
    // Write your code here
    
        for (int i=0; i<n; i++) {
            for (int j=1; j<=n; j++) {
                if (i < (n-j)) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
                
            }
            System.out.println("");
        }

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
