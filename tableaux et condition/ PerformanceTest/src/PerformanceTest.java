import java.math.BigInteger;

public class PerformanceTest {
    public static void main(String[] args) {
        int iterations = 1_000_000;
        int n = 20;

        // --- TEST AVEC LONG ---
        long startTimeLong = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            calculerFactorielleLong(n);
        }
        long endTimeLong = System.nanoTime();
        long dureeLong = (endTimeLong - startTimeLong);

        // --- TEST AVEC BIGINTEGER ---
        long startTimeBig = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            calculerFactorielleBig(n);
        }
        long endTimeBig = System.nanoTime();
        long dureeBig = (endTimeBig - startTimeBig);

        // --- RÉSULTATS ---
        System.out.println("Résultats pour 1 million de calculs :");
        System.out.println("Temps avec 'long'       : " + dureeLong / 1_000_000 + " ms");
        System.out.println("Temps avec 'BigInteger' : " + dureeBig / 1_000_000 + " ms");
        System.out.println("\nLe BigInteger est environ " + (dureeBig / dureeLong) + " fois plus lent !");
    }

    public static long calculerFactorielleLong(int n) {
        long f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }

    public static BigInteger calculerFactorielleBig(int n) {
        BigInteger f = BigInteger.ONE;
        for (int i = 1; i <= n; i++) f = f.multiply(BigInteger.valueOf(i));
        return f;
    }
}