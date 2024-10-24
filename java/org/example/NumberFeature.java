import java.util.Scanner;

public class NumberFeature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// 输入数字
        int number = scanner.nextInt();

// 将数字转换为字符串处理
        String numStr = Integer.toString(number);
        StringBuilder binaryStr = new StringBuilder();

// 遍历数字的每一位，进行奇偶性比较
        for (int i = 0; i < numStr.length() - 1; i++) {
            int currentDigit = Character.getNumericValue(numStr.charAt(i));
            int nextDigit = Character.getNumericValue(numStr.charAt(i + 1));

// 比较相邻位的奇偶性
            if ((currentDigit % 2) == (nextDigit % 2)) {
                binaryStr.append("1");
            } else {
                binaryStr.append("0");
            }
        }

// 将生成的二进制字符串转换为十进制整数
        int result = Integer.parseInt(binaryStr.toString(), 2);

// 输出结果
        System.out.println(result);

        scanner.close();
    }
}