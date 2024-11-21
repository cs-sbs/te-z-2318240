import java.util.Scanner;

public class NumberFeature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();

        int result = 0;

        // 遍历每个字符（数字），并根据奇偶性计算特征值
        for (int i = 0; i < input.length(); i++) {
            int digit = input.charAt(i) - '0';  // 获取当前数字字符对应的整数
            int position = input.length() - i;  // 计算当前数字的位置（从右至左）

            // 判断数字和位置的奇偶性是否一致
            boolean isDigitOdd = (digit % 2 != 0);
            boolean isPositionOdd = (position % 2 != 0);

            // 如果一致，则记录1，否则记录0
            if (isDigitOdd == isPositionOdd) {
                result += Math.pow(2, input.length() - i - 1); // 加上该位对应的二进制位权值
            }
        }

        System.out.println(result);  // 输出计算结果
    }
}