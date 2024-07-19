class FieldInitializations {
    //Single line initialization
    private int x = 10;
    private int[] marks;

    private static int a;
    private static String[] branches;

    //Initialize instance fields with complex logic
    FieldInitializations() {
        this.x = 400;

        //Some complex initialization
        this.marks = new int[x];
        for (int i = 0; i < x; ++i) {
            marks[i] = x * 10 * i;
        }
    }

    /*
     * {} - is a block
     * static {} - since static is written before {}.
     * it is static block
     */
    static { //NOT re-usable
        FieldInitializations.branches = new String[4];
        FieldInitializations.branches[0] = "CSE";
        FieldInitializations.branches[0] = "ECE";
        FieldInitializations.branches[0] = "MECH";
        FieldInitializations.branches[0] = "CIVIL";
    }

    //Re-usable static blocks- static methods
    //staic return_type methodName() - reusable  
}

public class Program_013_static_blocks {
    
}
