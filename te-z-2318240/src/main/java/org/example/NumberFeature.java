package org.example;

import java.util.Scanner;

public class NumberFeature {
    public static void main(String[] args) {
        // 从标准输入读取整行字符串
        Scanner in = new Scanner(System.in);
        String inputNumberStr = in.nextLine().trim();  // 读取一行并去除空白

        int result = 0;  // 存储结果的十进制值
        int position = 1; // 数位，从个位开始

        // 从右到左遍历输入的数字字符
        for (int i = inputNumberStr.length() - 1; i >= 0; i--) {
            // 获取当前位的数字字符
            char digitChar = inputNumberStr.charAt(i);
            int digit = digitChar - '0'; // 转换字符到数字

            // 判断数字和数位的奇偶性是否一致
            boolean isDigitOdd = (digit % 2 != 0); // 数字是否奇数
            boolean isPositionOdd = (position % 2 != 0); // 数位是否奇数

            // 如果一致，则在结果中加上当前位的二进制值
            if (isDigitOdd == isPositionOdd) {
                result += (1 << (position - 1)); // 使用位运算计算二进制位
            }

            position++; // 数位递增
        }

        // 输出结果
        System.out.println(result);
    }
}