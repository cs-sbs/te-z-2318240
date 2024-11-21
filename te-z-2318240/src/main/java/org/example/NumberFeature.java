import java.util.Scanner;

public class NumberFeature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt(); // 读取输入数字
        int result = 0; // 最终计算结果

        int count_byte = 0; // 二进制位的位数（从0开始）
        int count_crt = 1;  // 当前数字的位置，从1开始计数
        int n; // 存储当前位的数字

        do {
            n = inputNumber % 10; // 获取当前最低位数字
            if (n % 2 == count_crt % 2) { // 判断当前数字与位数的奇偶性是否相同
                result = result + (int) (1 * Math.pow(2, count_byte)); // 加入到二进制计算中
            }

            count_byte++; // 位数自增
            count_crt++;  // 位标记自增
            inputNumber = inputNumber / 10; // 去掉最低位数字
        } while (inputNumber != 0);

        System.out.println(result); // 输出最终结果
    }
}