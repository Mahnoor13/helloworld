import com.company.triangle.Triangle;

public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        triangle.setSide1(2);
        triangle.setSide2(3);
        triangle.setSide3(5);
        System.out.println("Area of triangle");
        triangle.calculateArea(triangle.getSide1(),triangle.getSide2(),triangle.getSide3());
        System.out.println("Perimeter of triangle");
        triangle.calculatePerimeter(triangle.getSide1(),triangle.getSide2(),triangle.getSide3());



    }
}
