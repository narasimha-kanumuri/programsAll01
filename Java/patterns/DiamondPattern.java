/*
       *
      ***
     *****
    *******
     *****
      ***
       *
 */
import java.util.*;

public class DiamondPattern {
    public static void main(String[] args) {
        int n = 4;
        pattern(n);
    }

    static void pattern(int n) {
        int i, j,space;

        for (i = 1; i <= n; i++) {
            for (space = 1; space <= n - i; space++) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (i = n-1; i >= 1; i--) {
            for (space = n-i; space >= 1; space--) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
