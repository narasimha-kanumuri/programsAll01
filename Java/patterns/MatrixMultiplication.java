import java.util.*;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m, n;
        System.out.println("Enter the rows for 1st array");
        m = sc.nextInt();
        System.out.println("Enter the columns for 1st array");
        n = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter the elements of the matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
        int m1, n1;
        System.out.println("Enter the rows for 2nd array");
        m1 = sc.nextInt();
        System.out.println("Enter the columns for 2nd array");
        n1 = sc.nextInt();
        int[][] brr = new int[m1][n1];
        System.out.println("Enter the elements of the matrix");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                brr[i][j] = sc.nextInt();
            }
        }
        int[][] crr = new int[m][n1];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n1; j++) {
                crr[i][j] = 0;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n1; j++) {
                for (int k = 0; k < m; k++) {
                    if (n != m1) {
                        System.out.println("Multiplication not possible");
                    } else {
                        crr[i][j] = arr[i][k] * brr[k][j] + crr[i][j];
                    }
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n1; j++) {
                System.out.print(crr[i][j] + " ");
            }
            System.out.println();
        }
    }
}