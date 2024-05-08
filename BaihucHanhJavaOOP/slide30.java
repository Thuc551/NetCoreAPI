
import java.util.Scanner;

public class TinhTongChuSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen n: ");
        int n = scanner.nextInt();

        int sum = 0;
        int temp = n;

        while (temp != 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }

        System.out.println("Tong cac chu so " + n + " la: " + sum);
    }
}

