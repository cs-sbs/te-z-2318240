package org.example;

import java.util.Scanner;

public class NumberFeature {
    public static void main(String[] args) {
        int inputNumber; // 输入的数字
        int result = 0;  // 最终的二进制结果
        Scanner in = new Scanner(System.in);
        inputNumber = in.nextInt(); // 读取输入的数字

        int position = 1; // 从个位开始
        while (inputNumber > 0) {
            int digit = inputNumber % 10; // 获取当前的个位数字
            inputNumber /= 10; // 移除最后一位数字

            // 判断数字和位置的奇偶性是否一致
            if ((digit % 2 == position % 2)) {
                result += (1 << (position - 1)); // 位置从1开始，2的幂表示当前位的二进制值
            }
            position++; // 数位加1
        }

        // 输出结果
        System.out.println(result);
    }
}