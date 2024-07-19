class Triangle {
    private float side1;
    private float side2;
    private float side3; // Instance Variable

    //Compiler automatically provides Default or No argument Constructor.

    //Parametrized Constructor
    Triangle(float s1, float s2, float s3) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    public void setSides(float s1, float s2, float s3) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    private float perimeter() {
        return (float) (side1 + side2 + side3) / 2;
    }

    private float area() {
        float s = (float) perimeter() / 2;
        float formula = (float) s * (s - side1) *
                (s - side2) * (s - side3);

        return (float) java.lang.Math.pow(formula, 0.5);
    }

    public float getSide1() {
        return side1;
    }

    public float getSide2() {
        return side2;
    }

    public float getSide3() {
        return side3;
    }

    public float getPerimeter() {
        return perimeter();
    }
    
    public float getArea() {
        return area();
    }

}

public class Program_009_Constructors_0 {
    public static void main(String[] args) {
        Triangle t = new Triangle(10f,20f,30f);
        //t.printDetails();
    }
}

