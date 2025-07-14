package com.github.hcsp.controlflow;

public class Main {
    public static void main(String[] args) {
        System.out.println(howManyPrimeNumbers(100));
    }

    /**
     * 给定一个数字n，返回1到n之间的质数个数，不包括n本身
     * 例如，n=5，返回2，因为1到5之间有2个质数：2和3
     * 提示：对于正整数n，如果用 2到 Math.sqrt(n)+1 之间的所有整数去除，均无法整除，则n为质数
     * @param n 给定的数字
     * @return 1到n之间(不包括n)质数的个数
     */


    /**
     * 这里其实我有一个逻辑误区,我一开始理解老师的注释说 无法整除就是质数
     * 所以我直接写了 j % i != 0 就直接 k++
     * 但实际上我误解了判断质数的整段逻辑应该怎么写
     * 首先目标是：判断某个数 i 是不是质数
     * 我一开始的逻辑是：
     * * 用从 2 到 Math.sqrt(n)+1 之间的 j 来试图除以 i
     * * 如果所有的 j 都无法整除 i（即 i % j != 0），那 i 是质数
     * * 所以你在循环里写：if (i % j != 0) { k++ }
     * 但我忽视了要全部的 j 都不能整除 i, 而不是 只要有一个不能整除就可以认定它是质数！
     * 换个方式说, 判断质数的关键是只要有一个 j 能整除 i（i % j == 0），那 i 就不是质数，立即退出检查
     * 如果所有 j 都不能整除 i（i % j != 0 对所有 j 都成立），那 i 是质数
     * 所以不能在第一次遇到 i % j != 0 就马上 k++
     * ✅ 正确的判断流程是：
     * 1. 假设它是质数（isPrime = true）
     * 2. 用所有 j 去试图整除 i
     * 3. 只要有一个能整除（i % j == 0），就说明不是质数 → isPrime = false; break;
     * 4. 如果都不能整除，循环完后才可以说 k++
     */


    public static int howManyPrimeNumbers(int n) {
        int i = 2;      // 这里i=2,而不是i=1👉因为质数的定义:一个质数是只能被 1 和它自己整除的整数，且必须大于 1
        int j = 2;
        int k = 0;
        for (i = 2; i < n; i++) {     // 找出 2 到 n 的所有数字
            boolean isPrime = true;
            for (j = 2; j <= Math.sqrt(i); j++) {    // 找质数就要用 2到 Math.sqrt(n)+1 之间的所有整数去除,所以j是2到Math.sqrt(n)+1
                if (i % j == 0) {  // 只要被整除就跳出, 不是质数
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                k++;
            }
        }

        return k;
    }
}

