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
        int count = 1;//设count计不为质数的个数，1默认为不是质数
        for (int i = 2; i < n; i++) {//进行循环跑出给1-n的数
            for (int j = 2; j <= Math.sqrt(i) + 1; j++) {
                if (i % j == 0 && i != j) {//判断其不为质数，并计数
                    count++;
                    break;
                }
            }
        }
        return n - 1 - count;//因为i不包括n,所以是n-1 个数减count
    }
}
