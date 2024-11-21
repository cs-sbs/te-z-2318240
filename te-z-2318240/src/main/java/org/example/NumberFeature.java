public class NumberFeature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();

        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            int digit = input.charAt(i) - '0';
            int position = input.length() - i;  // 从个位开始，1号位为个位，2号位为十位
            boolean digitIsOdd = (digit % 2 != 0);
            boolean positionIsOdd = (position % 2 != 0);

            if (digitIsOdd == positionIsOdd) {
                result += (1 << (input.length() - 1 - i));  // 根据二进制位权值计算
            }
        }

        System.out.println(result);
    }
}