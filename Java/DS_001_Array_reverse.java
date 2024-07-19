import java.io.*;
import java.util.stream.Stream;
import java.util.stream.*;
import java.util.*;

class ArrayReverse {
    public void arrInput() {
        
    }
}

public class DS_001_Array_reverse{
    public static void main(String[] args) {
        int N;

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        //Scanner input = new Scanner(System.in);
        //N = Integer.parseInt(input.readLine());
        N = 5;
        int[] array = new int[N];

        for (int i = 0; i < N; ++i) {
            array[i] = Integer.parseInt(input.next());
        }

        for (int element : array) {
            System.out.print(element + " ");            
        }

    }
}