package Home_Work_5;

public class CircleMath {
    private CircleMath(){}

    static double PI = 3.1415;

    static double length(double radius) {
        return 2 * PI * radius;
    }

    static double area(double radius) {
        return PI * radius * radius;
    }
}
