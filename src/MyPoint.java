public class MyPoint {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getxy() {
        int[] koordinater = {x, y};
        return koordinater;
    }

    public void setxy(int x, int y) {
    }

    @Override

    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    public double distances(int x,int y) {
        this.x = x;
        this.y = y;
        return 0;
    }
}


