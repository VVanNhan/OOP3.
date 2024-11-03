public class OOP32 {
    public static void main(String[] args) {
        MyPolynomial p1 = new MyPolynomial(1, 2, 3);
        MyPolynomial p2 = new MyPolynomial(3, 4, 5);
        System.out.println("p1: " + p1);
        System.out.println("p2: " + p2);
        System.out.println("Bậc của p1: " + p1.getDegree());
        System.out.println("Bậc của p2: " + p2.getDegree());
        System.out.println("Giá trị của p1 tại x=2: " + p1.evaluate(2));
        System.out.println("Giá trị của p2 tại x=3: " + p2.evaluate(3));
        MyPolynomial p3 = p1.add(p2);
        System.out.println("p1 + p2: " + p3);
        MyPolynomial p4 = p1.multiply(p2);
        System.out.println("p1 * p2: " + p4);
    }
}

