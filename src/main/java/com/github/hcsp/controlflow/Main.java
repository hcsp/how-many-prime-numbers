package com.github.hcsp.controlflow;

public class Main {
    public static void main(String[] args) {
        System.out.println(howManyPrimeNumbers(100));
//        System.out.println(howManyPrimeNumbers(5));//2个 2 3
//        System.out.println(howManyPrimeNumbers(10));//4个 2 3 5 7
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
        int prime_number = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 2; j <= Math.sqrt(n); j++) {
                if (i == 1) break;
                if (i == 2 || i == 3 || i == 5 || i == 7) {//2、3、5、7都是质数
                    prime_number += 1;
                    break;
                }
                if (i % j == 0) {//可以被整除，进行下一个i
                    break;
                }
                if (j == Math.floor(Math.sqrt(n))) {//向下取整，取较小的整数
                    prime_number++;
                }
            }
        }
        return prime_number;
    }
}
