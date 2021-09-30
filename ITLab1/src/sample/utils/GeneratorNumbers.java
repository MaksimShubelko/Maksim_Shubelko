package sample.utils;

import java.util.Random;

public abstract class GeneratorNumbers {
    private static Random random = new Random();
    private static int powerLetters = Constants.powerLetters;

    public static int generateKey() {
        int key = powerLetters;
        while (!isPrime(key, powerLetters)) {
            key = random.nextInt(Constants.maxRandomKey) + Constants.minRandomKey;
        }
        return key;
    }

    public static int gcd(int n, int m)
    {

        if (m > n) return gcd(m,n);
        if (m==0) return n;
        return gcd(m,n%m);
    }

    public static boolean isPrime(int m, int n)
    {
        return (gcd(n,m)==1);
    }
}
