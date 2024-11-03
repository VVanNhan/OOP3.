import java.math.BigInteger;
public class OOP33 {
    public static void main(String[] args) {
        String number1 = "11111111111111111111111111111111111111111111111111111";
        String number2 = "22222222222222222222222222222222222222222222222222222";
        BigInteger bigInt1 = new BigInteger(number1);
        BigInteger bigInt2 = new BigInteger(number2);
        BigInteger sum = bigInt1.add(bigInt2);
        System.out.println("Tổng: " + sum);
        BigInteger product = bigInt1.multiply(bigInt2);
        System.out.println("Tích: " + product);
    }
}
