package Home_Work_5;

public class Tree extends Plant {
    public Tree() {}

    public Tree(double height, double width) {
        super(height, width);
    }

    void grow() {
        height += 0.5;
    }
}
