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

        for (int i = 2;     //因为 1 不是质数，所以从 2 开始
             i <= n;
             i++) {

            boolean flag = true;    //用于判断是否为质数的标识量

            //是 j 从 2 到 n 的平方根的上限值，用 temp 存储，减少每次循环时，需要计算一次开平方
            int temp = (int) (Math.sqrt(i) + 1);
            for (int j = 2;j < temp;j++) {
                //判断是否为质数，如果满足条件则不是质数
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }

            //如果flag还是 true 说明 i 是一个质数
            if (flag){
                count++;
            }
        }

        return count;
    }
}
