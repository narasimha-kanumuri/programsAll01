class Square {
    public float side; //Fields

    public Square(float s) {
        side = s;
    }

    public float perimeter() {
        return (float) 4 * s;
    }

    public float area() {
        return side * side;
    }

    public void printDetails(){
        System.out.printf("Side: %.2f Perimeter: %f Area: %f\n");
    }
}

public class Program_009_Constructors_4 {
    public static void main(String[] args) {
        Square square = new Square(10);
        square.printDetails();
    }
}
