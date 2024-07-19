class Square {
    public int side;

    //Default Constructor
    Square() {
        //side = 5;
        //this() - Default Constructor

        //THIS SHOULD ALWAYS BE FIRST LINE IN METHOD
        //Explicit Constructor Invocation
        this(5);//Square(5);
    }

    //Parameterized Constructor - int side
    Square(int side) {
        this.side = side;
    }
}

class Triangle {
    //3 Sides - Instance Variables
    public int side1;
    public int side2;
    public int side3;

    //Overloading

    //Constructor Overloading
    //Default Constructor - 5,6,7
    Triangle() {
        /*
         * side1 = 5;
         * side2 = 6;
         * side3 = 7;
         */
        this(5, 6, 7);
    }

    //Equilateral Triangle - one side
    Triangle(int side) {
        /*
         * this.side1 = side;
         * this.side2 = side;
         * this.side3 = side;
         */
        this(side, side, side);
    }

    //Isosceles Triangle
    Triangle(int repeated_side, int side) {
        /*
         * this.side1 = side1;
         * this.side2 = side1;
         * this.side3 = side3;
         */
        this(repeated_side, repeated_side, side);
    }

    // Parameterized Single Side - this(side,side,side)
    Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
}

public class Program_012_this_constructor {
    public static void main(String[] args) {
        Square square1 = new Square();
        Square square2 = new Square(10);

        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(10);
        Triangle t3 = new Triangle(10, 20);
        Triangle t4 = new Triangle(10, 20, 30);
    }
}



