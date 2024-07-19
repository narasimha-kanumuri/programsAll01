/*
 * int[] numArr = { 100, 10, 50, 420, 498, 370, 0 };

        String str = "Sample string";

        String[] strArr = {
            "Saurabh",
            "dada",
            "Abhishek",
                    "Babu",
                            
        };
 */
import java.util.*;
import java.util.Scanner;

public class arrayNumStrSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String str = sc.nextLine();

        String[] numArr = num.split(" ");
        String[] strArr = str.split(" ");
        Arrays.sort(numArr);
        System.out.println(Arrays.toString(numArr));


    }

}

