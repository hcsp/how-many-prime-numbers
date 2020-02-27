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
        int count=0;
        if(n<2)return 0;
        for(int i=2;i<=n;i++){
            if(isPrimeNumber(i)) count++;
        }
           return count;
    }
    public static boolean isPrimeNumber(int num){
        if(num==2) return true;
        if(num<2||num%2==0)return false;
        for(int i=3;i<=Math.sqrt(num);i+=2){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
