package com.github.hcsp.controlflow;

public class Main {
    public static void main(String[] args) {
        System.out.println(howManyPrimeNumbers(2));
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
        if (n > 2) {
            boolean zhishu = true;
            int geshu = 1;
            for (int x = 3; x < n; x++) {
                for (int i = 2; i < Math.sqrt(x) + 1; i++) {
                    if ((x % i) == 0) {   //3
                        zhishu = false;
                        break;//如果是合数 false
                    } else {
                        zhishu = true;// i ++
                    }
                }     //jieguo 要不就是false yaobu jiushi true
                if (zhishu == true) {
                    geshu++;
                }
            }
            return geshu;
        } else {
            return 0;
        }
    }
}
