import java.util.Scanner;

public class home1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oddCount = 0;
        int evenCount = 0;
        int num;
        while ((num = scanner.nextInt())!= -1) {
            if (num % 2!= 0) {
                oddCount++;
            } else {
                evenCount++;
            }
        }
        System.out.println(oddCount + " " + evenCount);
    }
}