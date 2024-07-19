class Point {
    public int x = 0;
    public int y = 0;

    public Point(int a, int b) {
        x = a;
        y = b;
    }
}

class Rectangle {
    public int length = 0;
    public int breadth = 0;
    public Point origin;

    //Default, Non-Parameterized Constructor
    public Rectangle() {
        origin = new Point(0, 0);
    }

    //Parameterized Constructor
    public Rectangle(Point p) {
        origin = p;
    }

    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    public Rectangle(Point p, int l, int b) {
        origin = p;
        length = l;
        breadth = b;
    }

    //Move Rectangle
    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
    }

    public int getArea() {
        return length * breadth;
    }
}

public class Program_009_Constructors_1 {
    public static void main(String[] args) {
        
        Point originOne = new Point(23, 94);
        Rectangle rectOne = new Rectangle(originOne,100,200);
        Rectangle rectTwo = new Rectangle(50, 100);

        System.out.println(rectOne.length);
        System.out.println(rectOne.breadth);
        System.out.println(rectOne.getArea());

        rectTwo.origin = originOne;

        System.out.println(rectTwo.origin.x);
        System.out.println(rectTwo.origin.y);

        //Move rect2 & display its new position.
        rectTwo.move(40, 72);
        System.out.println(rectTwo.origin.x);
        System.out.println(rectTwo.origin.y);
    }
}
