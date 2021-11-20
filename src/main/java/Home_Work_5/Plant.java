package Home_Work_5;

public class Plant {
    double height;
    double width;

    public Plant() {}

    public Plant(double height, double width) {
        this.height = height;
        this.width = width;
    }

    void grow() {
        System.out.println("Я расту");
    }
}
