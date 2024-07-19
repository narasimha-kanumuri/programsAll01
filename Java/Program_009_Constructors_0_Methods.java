class MethodExamples {
    public arbitraryArguments(int...values){
        int numberOfValues = values.length;
        
        for (int value : values) {
            System.out.print(value + " ");
        }
    }
}

public class Program_009_Constructors_0_Methods {
    public static void main(String[] args) {
        MethodExamples example = new MethodExamples();
        example.arbitraryArguments(1, 2, 3, 4);
    }
}
