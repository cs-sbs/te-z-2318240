package org.example;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int number;
        int countOdd = 0;  // 奇数计数
        int countEven = 0; // 偶数计数
        Scanner in = new Scanner(System.in);

        // 循环读取数据，直到遇到 -1 为止
        while (true) {
            number = in.nextInt();
            if (number == -1) {
                break;  // 输入 -1 结束循环
            }
            // 判断奇偶
            if (number % 2 == 0) {
                countEven++; // 偶数
            } else {
                countOdd++;  // 奇数
            }
        }

        // 输出结果
        System.out.println(countOdd + " " + countEven);
    }
}