

public class Program_010_pass_by_value {
    int x = 44;//Class Fields
    int y = 77;

    public static void changeValues(int x, int y) {//parameters
        System.out.printf("INSIDE METHOD: BEFORE CHANGING: ORIGINAL PARAMETER VALUES: x:%d, y:%d\n",x,y);
        x = 100;
        y = 200;
        System.out.printf("INSIDE METHOD: AFTER CHANGING PARAMETER VALUES: x:%d, y:%d\n", x, y);
    }

    public static void main(String[] args) {
        int x = 99; //Local Variable
        int y = 88;
        System.out.printf("Before Invoking x:%d, y:%d:\n",x,y);
        changeValues(x, y);
        System.out.printf("After Invoking x:%d y:%d:\n", x, y);
    }
}
