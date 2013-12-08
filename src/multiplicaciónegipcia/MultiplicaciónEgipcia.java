package multiplicaciónegipcia;

import java.math.BigInteger;

public class MultiplicaciónEgipcia {

    public static void main(String[] args) {
        BigInteger a = multiplicaciónEgipcia(BigInteger.valueOf(10), BigInteger.valueOf(15));
        System.out.println(a);
        BigInteger b = multiplicaciónEgipcia(BigInteger.valueOf(5), BigInteger.valueOf(20));
        System.out.println(b);
        BigInteger c = multiplicaciónEgipcia(BigInteger.valueOf(3589), BigInteger.valueOf(0));
        System.out.println(c);
        BigInteger d = multiplicaciónEgipcia(BigInteger.valueOf(24), BigInteger.valueOf(1));
        System.out.println(d);
    }

    public static BigInteger multiplicaciónEgipcia(BigInteger num1, BigInteger num2) {
        BigInteger[] result = new BigInteger[2];
        result = multiplicaEgipcia(num1, num2, BigInteger.ONE);
        return result[0];
    }

    public static BigInteger[] multiplicaEgipcia(BigInteger num1, BigInteger num2, BigInteger doble1) {
        BigInteger[] res = {BigInteger.ZERO, BigInteger.ZERO};
        if (doble1.compareTo(num2) == 1) {
            return res;
        } else {
            res = multiplicaEgipcia(num1, num2, doble1.multiply(dos()));
            if ((res[1].add(doble1)).compareTo(num2) <= 0) {
                res[0] = res[0].add(num1.multiply(doble1));
                res[1] = res[1].add(doble1);
            }
            return res;

        }
    }

    private static BigInteger dos() {
        return BigInteger.valueOf(2);
    }
}