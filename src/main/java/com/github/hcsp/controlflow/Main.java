package com.github.hcsp.controlflow;

public class Main {
    public static void main(String[] args) {
        System.out.println(howManyPrimeNumbers(100));
        System.out.println(howManyPrimeNumbers(5));
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
        if (n == 1 || n == 2||n<=0) {
            return 0;
        } else {
            for(int i=3;i<n;i++) {//遍历n之内的2-n的整数
                for (int j = 2; j <= (int) (Math.sqrt(i) + 1); j++) {//判断这个整数是不是质数
                    if (i % j == 0 ) {//可以除尽说明这个数不是质数，跳出循环，不是质数的数加1
                        count++;
                        break;//这数不是质数，跳出内层for循环
                    }
                }
            }
            return n-count-2;//总的数减不是质数的数减本身减1就是质数的数量
        }
    }
}
