package org.example;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int number;
        int countOdd = 0;  // 记录奇数的个数
        int countEven = 0; // 记录偶数的个数
        Scanner in = new Scanner(System.in);

        // 通过do-while循环读取输入直到输入-1
        do {
            number = in.nextInt();
            if (number != -1) { // 如果输入不是-1
                if (number % 2 == 0) {
                    countEven++; // 偶数
                } else {
                    countOdd++;  // 奇数
                }
            }
        } while (number != -1); // 循环直到输入-1结束

        // 输出结果，奇数个数和偶数个数
        System.out.println(countOdd + " " + countEven);
    }
}