package Home_Work_6;

public class Car implements Vehicle{

    double x;
    double y;
    double speed;
    private double ink;

    public Car(){}

    public Car(double x, double y, double speed) {
        this.x = x;
        this.y = y;
        this.speed = speed;
    }

    @Override
    public void move(double new_x, double new_y) {
        x = new_x;
        y = new_y;
    }

    @Override
    public void changeSpeed(double inc) {
        speed += inc;
    }
}
