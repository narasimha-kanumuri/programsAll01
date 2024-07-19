class Circle {
    public int radius; //Field, Instance Variable

    Circle(int radius) {//parameter
        //radius = radius; //Shadowing
        this.radius = radius;
    }
}

public class Program_012_this_1 {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println(circle.radius);
        Circle circle2 = new Circle(20);
        System.out.println(circle2.radius);
    }
}