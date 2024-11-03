public class OOP36 {
    public static void main(String[] args) {
        Ball ball = new Ball(50, 50, 10, 5, 45);
        System.out.println(ball);

        Container container = new Container(0, 0, 100, 100);
        System.out.println(container);
        for (int i = 0; i < 20; i++) {
            ball.move();
            if (container.collides(ball)) {
                System.out.println("Va chạm xảy ra!");
            }
            System.out.println(ball);
        }
    }
}
