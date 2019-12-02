package com.github.hcsp.controlflow;

public class Main {
    public static void main(String[] args) {
        System.out.println(howManyPrimeNumbers(100));
        System.out.println(howManyPrimeNumbers(5));
        System.out.println(howManyPrimeNumbers(4));
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
        int num = 0;
        for (int j = 1; j < n; j++) {
            boolean flag = true;
            for (int i = 2; i <= Math.sqrt(j) + 1; i++) {
                // 可以整除就跳出
                if (j % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) num++;
        }
        return num;
    }
}
