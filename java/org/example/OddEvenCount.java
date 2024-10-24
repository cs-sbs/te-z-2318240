import java.util.Scanner;

public class OddEvenCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oddCount = 0;
        int evenCount = 0;

        while (true) {
            System.out.println("请输入一个整数（输入-1结束）：");
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt(); // 读取整数输入
                if (num == -1) { // 输入 -1 时结束输入
                    break;
                }
                if (num % 2 == 0) { // 偶数判断
                    evenCount++;
                } else { // 奇数判断
                    oddCount++;
                }
            } else {
                System.out.println("无效输入，请输入一个整数！");
                scanner.next(); // 清除错误输入
            }
        }

        System.out.println("奇数个数：" + oddCount + "，偶数个数：" + evenCount); // 输出奇数个数和偶数个数
    }
}
