import java.util.Arrays;

public class Program_007 {
    public static void main(String[] args) {
        String[] registerOfNames = {
                "Shivamani", "Virat", "Rajinikanth",
                "Ram", "Robert", "rahim", "Apparao",
                "Andrew", "Mr. Bean", "Hulk" };
        String[] lateJoiners = new String[5];
        
        //Arrays.sort(registerOfNames);
        Arrays.fill(lateJoiners, 1, 4, "Hello");
        // for name in registerOfNames
        for (String name : lateJoiners) {
            System.out.println(name);
        }
    }
}