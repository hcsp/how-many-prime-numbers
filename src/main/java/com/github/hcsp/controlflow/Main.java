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
        //记录个数
        int count = 0;
        //循环遍历传进来的参数
        for (int i = 1; i < n; i++) {
            //判断是否为素数
            boolean isPrime = true;
            //判断用2到Math.sqrt(n)+1之间的所有整数去除，均无法整除，则n为质数。
            for (int j = 2; j <= Math.sqrt(i) + 1; j++) {
                //判断是否可以整除
                if (i % j == 0) {
                    //判断是素数
                    isPrime = false;
                    //跳出
                    break;
                }
            }
            //素数
            if (isPrime) {
                //给count 加1
                count++;
            }
        }
        //返回count
        return count;
    }
}

