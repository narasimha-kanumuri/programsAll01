public class Program_011_flow_of_control_recursion_2 {

    public int fun(int x) {
        if (x > 100) 
            return x - 10;
        return fun(fun(x + 11));
    }

    public static void main(String[] args) {
        Program_011_pass_by_value obj;
        obj = new Program_011_flow_of_control_recursion_1();
        System.out.println(obj.fun(4));
    }
}
