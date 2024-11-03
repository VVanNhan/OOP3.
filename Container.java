public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    public Container(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth() {
        return x2 - x1;
    }

    public int getHeight() {
        return y2 - y1;
    }
    public boolean collides(Ball ball) {
        float ballX = ball.getX();
        float ballY = ball.getY();
        int radius = ball.getRadius();
        if (ballX - radius < x1 || ballX + radius > x2) {
            ball.reflectHorizontal();
            return true;
        }
        if (ballY - radius < y1 || ballY + radius > y2) {
            ball.reflectVertical();
            return true;
        }
        return false;
    }
    @Override
    public String toString() {
        return "Container[(" + x1 + "," + y1 + "),(" + x2 + "," + y2 + ")]";
    }
}
