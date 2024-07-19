import java.util.Arrays;

public class Program_006 {
    public static void main(String[] args) {
        String[] registerOfNames = {
                "Shivamani", "Virat", "Rajinikanth",
                "Ram", "Robert", "Rahim", "Apparao",
                "Andrew", "Mr. Bean", "Hulk" };
        String[] lateJoiners = new String[5];
        //System.out.println(System.currentTimeMillis());
        //System.out.println(Arrays.toString(lateJoiners));
        //System.out.println(Arrays.toString(registerOfNames));

        /*
        for (int i = 0; i < registerOfNames.length; i++) {
            System.out.println(registerOfNames[i]);
        }
        */

        System.arraycopy(registerOfNames, 5, lateJoiners, 1, 4);
        //for name in registerOfNames
        for (String name : lateJoiners) {
            System.out.println(name);
        }

    }
}
