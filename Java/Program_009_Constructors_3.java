class Circle {
    static final float PI = 3.14f;// Class Variable
    public float radius; // Instance Variable

    public Circle() {
        radius = 4;
    }

    //Overloading
    public Circle(float r) {
        this.radius = r;
    }

    public float circumference() {
        return 2 * PI * radius;
    }

    public float area() {
        return PI * radius * radius;
    }

    public void printDetails() {
        System.out.printf("Radius: %.2f Circumference: %f Area: %f\n", radius, circumference(), area());
    }
}

class Square {
    float side; // Instance Variable

    Square() {
        side = 5;
    }

    Square(float s) {
        side = s;
    }
    public float area() {
        return side * side;
    }

    public float perimeter() {
        return 4 * side;
    }

    public void printDetails() {
        System.out.printf("Side: %.2f Perimeter: %f Area: %f\n", side, perimeter(), area());
    }
}

class Triangle {
    float side1, side2, side3; // Instance Variable

    Triangle() {
        side1 = 5;
        side2 = 10;
        side3 = 15;
    }

    Triangle(float s1, float s2, float s3){
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    public float perimeter() {
        return (float) (side1 + side2 + side3) / 2;
    }

    public float area() {
        float s = (float) perimeter()/2;
        float formula = (float) s * (s - side1) *
                (s - side2) * (s - side3);

        return (float) java.lang.Math.pow(formula, 0.5);
    }

    public void printDetails() {
        System.out.printf("\nSide1: %f Side2: %f Side3: %f\nPerimeter: %f Area: %f\n", side1, side2, side3,perimeter(), area());
    }
}

public class Program_009_Constructors_3 {
    public static void main(String[] args) {
        
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Circle circle3 = new Circle();
        Circle circle4 = new Circle(40.0f);
        Circle circle5 = new Circle(50);
        Circle circle6 = new Circle(60);
        Circle circle7 = new Circle(70);
        Circle circle8 = new Circle(80);
        Circle circle9 = new Circle(90);
        Circle circle10 = new Circle(100);
        
        Square square1 = new Square();
        Square square2 = new Square();
        Square square3 = new Square(30);
        Square square4 = new Square(40);
        Square square5 = new Square(50);
        Square square6 = new Square(60);
        Square square7 = new Square(70);
        Square square8 = new Square(80);
        Square square9 = new Square(90);
        Square square10 = new Square(100);

        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle();
        Triangle triangle3 = new Triangle();
        Triangle triangle4 = new Triangle();
        Triangle triangle5 = new Triangle(50, 60, 70);
        Triangle triangle6 = new Triangle(60, 70, 80);
        Triangle triangle7 = new Triangle(70, 80, 90);
        Triangle triangle8 = new Triangle(80, 90, 100);
        Triangle triangle9 = new Triangle(90, 100, 110);
        Triangle triangle10 = new Triangle(100, 110, 120);

        circle1.printDetails();
        circle2.printDetails();
        circle3.printDetails();
        circle4.printDetails();
        circle5.printDetails();
        circle6.printDetails();
        circle7.printDetails();
        circle8.printDetails();
        circle9.printDetails();
        circle10.printDetails();
        
        square1.printDetails();
        square2.printDetails();
        square3.printDetails();
        square4.printDetails();
        square5.printDetails();
        square6.printDetails();
        square7.printDetails();
        square8.printDetails();
        square9.printDetails();
        square10.printDetails();
        
        triangle1.printDetails();
        triangle2.printDetails();
        triangle3.printDetails();
        triangle4.printDetails();
        triangle5.printDetails();
        triangle6.printDetails();
        triangle7.printDetails();
        triangle8.printDetails();
        triangle9.printDetails();
        triangle10.printDetails();

        
    }
}
