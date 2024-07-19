import java.util.*;
 
public class Intro {
    public static void main(String args[]) {
        System.out.println(factorialOfNumber(10));
        System.out.println(11 % -4);
        
        Practice p = new Practice();
        System.out.println(p.integralDecimalSeparation(76.987));;

    }
    
    static int factorialOfNumber(int num){
        int ans = 1;
        for (int i = num; i > 1; --i) {
            ans *= i;
        }
        return ans;
    }

}

class Practice {
    //Practice()
    double integralDecimalSeparation(double number) {
        double fraction = number % 1;

        return fraction;
    }

    void storeExamScore() {
        int score[][] = new int[4][4];
        score[0][0] = 10;
        score[0][1] = 20;
        score[1][0] = 30;
        score[1][1] = 40;
        score[1][2] = 50;
    }
}