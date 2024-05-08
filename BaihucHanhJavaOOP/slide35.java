
import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhap so thu nhat: ");
        int number1 = scanner.nextInt();
        
        System.out.print("Nhap so thu hai: ");
        int number2 = scanner.nextInt();
        
        int minNumber = Math.min(number1, number2);
        
        System.out.println("So nho nhat trong hai so " + number1 + " va " + number2 + " la: " + minNumber);
    }
}

