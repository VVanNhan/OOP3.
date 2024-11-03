public class OOP37 {
    public static void main(String[] args) {
        Ball1 ball = new Ball1(0, 0, 0);
        System.out.println("Ball ban đầu: " + ball);
        Player player = new Player(10, 5, 5);
        System.out.println("Player ban đầu: " + player);
        player.move(2, 3);
        System.out.println("Player sau khi di chuyển: " + player);
        player.jump(5);
        System.out.println("Player sau khi nhảy: " + player);
        System.out.println("Player gần bóng không: " + player.near(ball));
        player.kick(ball);
        System.out.println("Ball sau khi bị đá: " + ball);
    }
}
