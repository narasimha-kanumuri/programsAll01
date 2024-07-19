class Circle {
    private int radius;

    Circle(int r) {
        setRadius(r);
    }

    public void setRadius(int r) {
        radius = r;
    }

    public int getRadius() {
        return radius;
    }

    //1mb space wastage for this rarely used method
    /*
    public void increaseRadius(int increase) {
        //Increase Radius
        setRadius(getRadius() + increase);
    }
    */
}

public class Program_010_pass_reference_by_value {

    public static  void increaseRadius(Circle circe_obj,int increase) {
        //Increase Radius
        circe_obj.setRadius(circe_obj.getRadius() + increase);

        System.out.println("INSIDE METHOD: ORIGINAL REF" + circe_obj);
        //Reference is also passed by value
        circe_obj = new Circle(123);
        System.out.println("INSIDE METHOD: NEW REF" + circe_obj);
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(10);

        System.out.println(circle1 + ", " + circle1.getRadius());

        increaseRadius(circle1, 900);

        System.out.println(circle1 + ", " + circle1.getRadius());

    }
}
