
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        
        while (true) {
            System.out.print("Nhập vào một số nguyên: ");
            int number = scanner.nextInt();
            
            sum += number;
            
            if (sum > 100) {
                System.out.println("Tổng của các số đã nhập là: " + sum);
                break;
            }
        }
        
        scanner.close();
    }
}

