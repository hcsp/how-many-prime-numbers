package com.github.hcsp.controlflow;

public class Main {
    public static void main(String[] args) {
        System.out.println(howManyPrimeNumbers(100));
    }

    /**
     * 给定一个数字n，返回1到n之间的质数（素数）个数，不包括n本身。
     *
     * <p>例如，n=5，返回2，因为1到5之间有2个质数：2和3。
     *
     * <p>提示：对于正整数n，如果用2到Math.sqrt(n)+1之间的所有整数去除，均无法整除，则n为质数。
     *
     * @param n 给定的数字
     * @return 1到n之间(不包括n)质数的个数
     */
    public static int howManyPrimeNumbers(int n) {
        int count = 0;
        if (n < 2) return count;

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        return count;
    }

    public static boolean isPrime(int num) {
        double sqrt = Math.sqrt(num);

        if (num < 2) return false;

        if(num == 2 || num == 3) return true;

        if(num %2 == 0) return false;

        for (int i = 3; i < sqrt + 1; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
