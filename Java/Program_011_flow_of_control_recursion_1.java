public class Program_011_flow_of_control_recursion_1 {
    
    public void fun(int x) {
        if (x > 1) {
            fun((int) x / 2);
            fun((int) x / 2);
        }
        System.out.print(x + " ");
    }
    
    public static void main(String[] args) {
        Program_010_pass_by_value obj;
        obj = new Program_011_flow_of_control_recursion_1();
        obj.fun(4);
    }
}

