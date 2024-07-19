//import OuterClass.staticNestedClass;

class OuterClass {

    String outerField = "OuterClass Instance Field";
    static String staticOuterField = "OuterClass Static Field";

    class InnerClass {
        void nestedMember() {
            System.out.println(outerField);
            System.out.println(staticOuterField);
        }
    }

    static class StaticNestedClass {
        void nestedMember(OuterClass outer) {
            //System.out.println(outerField);
            System.out.println(outer.outerField);
            System.out.println(staticOuterField);
        }
    }
}

public class Program_014_NestedClass_Implementation {
    public static void main(String[] args) {

        OuterClass outerObj = new OuterClass();

        System.out.println("Inner Class");
        System.out.println("-----------------------");

        OuterClass.InnerClass innerObj = outerObj.new InnerClass();
        innerObj.nestedMember();

        System.out.println();
        System.out.println("Static Nested Class");
        System.out.println("-------------------------");

        OuterClass.StaticNestedClass staticNestedObj = new OuterClass.StaticNestedClass();
        staticNestedObj.nestedMember(outerObj);

        System.out.println("\nOuter Class Fields:");
        System.out.println("-----------------------");
        System.out.println(outerObj.outerField);
        System.out.println(OuterClass.staticOuterField);

    }
}
