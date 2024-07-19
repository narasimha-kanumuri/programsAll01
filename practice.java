import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int test_cases = sc.nextInt();
        for (int i = 0; i < test_cases; i++) {
            int n = sc.nextInt();
            
            //byte
            int capacity = Math.pow(2, 7);
            if (-capacity <= n && n <= capacity - 1) {
                System.out.printf("%d can be fitted in:\n");
                System.out.print("*bytes\n*short\n*int\n*long\n");
            }
            capacity *= 2;
            if (-byte_capacity <= n && n <= byte_capacity - 1) {
                System.out.printf("%d can be fitted in:\n");
                System.out.print("*short\n*int\n*long\n");
            }
        }
        
    }
}