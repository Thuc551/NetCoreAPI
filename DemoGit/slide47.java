
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        
        while (true) {
            System.out.print("Nhap so nguyen: ");
            int num = scanner.nextInt();
            sum += num;
            
            if (sum > 100) {
                break;
            }
        }
        
        System.out.println("Tong cac so la: " + sum);
    }
}

