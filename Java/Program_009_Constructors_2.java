class Circle {
    static final float PI = 3.14f;// Class Variable
    float radius = 78; // Instance Variable

    public float circumference() {
        return 2 * PI * radius;
    }

    public float area() {
        return PI * radius * radius;
    }

    /*
     * Avoids Calling Circumference(), area()
     * separately for each object.
     * We can Execute each object details
     * with single calling.
     */
    public void printDetails() {
        System.out.printf("Radius: %.2f Circumference: %f Area: %f\n", radius, circumference(), area());
    }
}

class Square {
    float side; // Instance Variable

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

    public float semiPerimeter() {
        return (float) (side1 + side2 + side3) / 2;
    }

    public float area() {
        float s = semiPerimeter();
        float formula = (float) s * (s - side1) *
                (s - side2) * (s - side3);
                                    
        return (float)java.lang.Math.pow(formula, 0.5);
    }

    public void printDetails() {
        System.out.printf("\nSide1: %f Side2: %f Side3: %f\nArea: %f\n", side1, side2, side3, area());
    }
}

public class Program_009_Constructors_2 {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Circle circle3 = new Circle();
        Circle circle4 = new Circle();
        Circle circle5 = new Circle();
        Circle circle6 = new Circle();
        Circle circle7 = new Circle();
        Circle circle8 = new Circle();
        Circle circle9 = new Circle();
        Circle circle10 = new Circle();

        //circle1.radius = 10;
        circle2.radius = 20;
        circle3.radius = 30;
        circle4.radius = 40;
        circle5.radius = 50;
        circle6.radius = 60;
        circle7.radius = 70;
        circle8.radius = 80;
        circle9.radius = 90;
        circle10.radius = 100;

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

        // Square
        Square square1 = new Square();
        Square square2 = new Square();
        Square square3 = new Square();
        Square square4 = new Square();
        Square square5 = new Square();
        Square square6 = new Square();
        Square square7 = new Square();
        Square square8 = new Square();
        Square square9 = new Square();
        Square square10 = new Square();

        square1.side = 10;
        square2.side = 20;
        square3.side = 30;
        square4.side = 40;
        square5.side = 50;
        square6.side = 60;
        square7.side = 70;
        square8.side = 80;
        square9.side = 90;
        square10.side = 100;

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

        // Triangle
        Triangle triangle1 = new Triangle();
        Triangle triangle2 = new Triangle();
        Triangle triangle3 = new Triangle();
        Triangle triangle4 = new Triangle();
        Triangle triangle5 = new Triangle();
        Triangle triangle6 = new Triangle();
        Triangle triangle7 = new Triangle();
        Triangle triangle8 = new Triangle();
        Triangle triangle9 = new Triangle();
        Triangle triangle10 = new Triangle();

        // Triangle1
        triangle1.side1 = 10;
        triangle1.side2 = 11;
        triangle1.side3 = 12;

        // Triangle2
        triangle2.side1 = 20;
        triangle2.side2 = 21;
        triangle2.side3 = 22;

        // Triangle3
        triangle3.side1 = 30;
        triangle3.side2 = 31;
        triangle3.side3 = 32;

        // Triangle4
        triangle4.side1 = 40;
        triangle4.side2 = 41;
        triangle4.side3 = 42;

        // Triangle5
        triangle5.side1 = 50;
        triangle5.side2 = 51;
        triangle5.side3 = 52;

        // Triangle6
        triangle6.side1 = 60;
        triangle6.side2 = 61;
        triangle6.side3 = 62;

        // Triangle7
        triangle7.side1 = 70;
        triangle7.side2 = 71;
        triangle7.side3 = 72;

        // Triangle8
        triangle8.side1 = 80;
        triangle8.side2 = 81;
        triangle8.side3 = 82;

        // Triangle9
        triangle9.side1 = 90;
        triangle9.side2 = 91;
        triangle9.side3 = 92;

        // Triangle10
        triangle10.side1 = 100;
        triangle10.side2 = 101;
        triangle10.side3 = 102;

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

        /*
         * System.out.println(circle1.circumference());
         * System.out.println(circle2.circumference());
         * System.out.println(circle3.circumference());
         * System.out.println(circle1.area());
         * System.out.println(circle2.area());
         * System.out.println(circle3.area());
         */
        /*
         * System.out.println(circle1);
         * System.out.println(circle2);
         * System.out.println(circle3);
         */
    }
}