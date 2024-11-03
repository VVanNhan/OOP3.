public class OOP31 {
    public static void main(String[] args) {
        MyComplex c1 = new MyComplex();
        System.out.println("c1 (default): " + c1);
        MyComplex c2 = new MyComplex(3, 4);
        System.out.println("c2: " + c2);
        c1.setReal(5);
        c1.setImag(6);
        System.out.println("c1 after set: " + c1);
        System.out.println("c1 real part: " + c1.getReal());
        System.out.println("c1 imaginary part: " + c1.getImag());
        System.out.println("c1 is real: " + c1.isReal());
        System.out.println("c1 is imaginary: " + c1.isImaginary());
        MyComplex c3 = new MyComplex(5, 0);
        System.out.println("c3: " + c3);
        System.out.println("c3 is real: " + c3.isReal());
        System.out.println("c3 is imaginary: " + c3.isImaginary());
        System.out.println("c1 equals (5, 6): " + c1.equals(5, 6));
        System.out.println("c1 equals c2: " + c1.equals(c2));
        System.out.println("c2 magnitude: " + c2.magnitude());
        System.out.println("c2 argument (in radians): " + c2.argument());
        c1.add(c2);
        System.out.println("c1 after adding c2: " + c1);
        c1.subtract(c2);
        System.out.println("c1 after subtracting c2: " + c1);
        c1.multiply(c2);
        System.out.println("c1 after multiplying by c2: " + c1);
        MyComplex c4 = new MyComplex(1, 1);
        c4.divide(c2);
        System.out.println("c4 after dividing by c2: " + c4);
        MyComplex c5 = c2.addNew(new MyComplex(1, 1));
        System.out.println("c2 after addNew (should not change): " + c2);
        System.out.println("New complex from addNew: " + c5);
        MyComplex c6 = c2.subtractNew(new MyComplex(1, 1));
        System.out.println("New complex from subtractNew: " + c6);
        System.out.println("Conjugate of c2: " + c2.conjugate());
    }
}
