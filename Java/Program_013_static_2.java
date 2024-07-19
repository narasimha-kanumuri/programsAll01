class Circle{
    public int radius;
    public static final float PI = 3.14f;

    public Circle(int radius) {
        this.radius = radius;
    }
    
    public static float getPI() {
        return Circle.PI;
    }

    /*
    public static void setRadius(float r) {
        radius = r;
    }
    */
}

public class Program_013_static_2 {
    public static void main(String[] args) {
        System.out.println(Circle.PI);
    }   
}
