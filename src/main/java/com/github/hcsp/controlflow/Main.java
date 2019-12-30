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
        int count = 0;      //累计 n 有多少个质数

        //因为 1 不是质数，所以从 2 开始
        for (int i = 2;i <= n;i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        return count;
    }

    private static boolean isPrime(int i) {
        if (i <= 3) {
            return i > 1;
        }
        //为减少循环判定的次数，定义了一个上界limit
        int limit = (int) (Math.sqrt(i) + 1);
        for (int j = 2; j < limit; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
