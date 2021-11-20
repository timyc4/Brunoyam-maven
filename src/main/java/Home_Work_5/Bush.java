package Home_Work_5;

public class Bush extends Plant {
    public Bush() {
    }

    public Bush(double height, double width) {
        super(height, width);
    }

    void grow() {
        width += 0.01;
    }
}

