package com.github.hcsp.controlflow;

import java.util.ArrayList;

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
        ArrayList<Integer> isPrime = new ArrayList<>();//定义一个列表用于存放找到的质数
        boolean flag=true;
        int count = 0;//定义一个计数器
        for (int i = 2; i <n ; i++) {//外层循环+最小的质数为2
            int sqrt=(int)Math.sqrt(i);//艰涩循环次数，提高效率
            for (int j = 2; j <(sqrt+1) ; j++) {
                if(i%j==0){
                    flag=false;//如果这个数不是质数，标记为false
                    break;
                }
                else flag=true;//是质数标记为true
            }
            if (flag){
                count++;
                isPrime.add(i);//将所有的质数存入列表中
            }
        }
            System.out.println(String.join(",", String.valueOf(isPrime)));
            System.out.print("质数的个数为:");
            return count;
        }
}
