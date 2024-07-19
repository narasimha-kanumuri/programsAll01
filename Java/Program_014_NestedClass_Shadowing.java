class ShadowExample {
    public int x = 10;

    class InnerClass {
        public int x = 200;

        void innerMethod(int x) {
            System.out.println("x: " + x);
            System.out.println("InnerClass x: " + this.x);
            System.out.println("OuterClass x: " + ShadowExample.this.x);
        }
    }
}

public class Program_014_NestedClass_Shadowing {
    public static void main(String[] args) {
        ShadowExample se = new ShadowExample();
        //How to access innerMethod??
        ShadowExample.InnerClass innerObj;
        innerObj = se.new InnerClass();
        innerObj.innerMethod(4000);
    }    
}
