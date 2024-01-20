
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        int number1 = scanner.nextInt();

        System.out.print("Nhập số thứ hai: ");
        int number2 = scanner.nextInt();
      
        int sum = number1 + number2;
        System.out.println("Tổng của hai số là: " + sum);

        int difference = number1 - number2;
        System.out.println("Hiệu của hai số là: " + difference);

        int product = number1 * number2;
        System.out.println("Tích của hai số là: " + product);
        
        double quotient = (double) number1 / number2;
        System.out.println("Thương của hai số là: " + quotient);
       
        int remainder = number1 % number2;
        System.out.println("Chia lấy dư của hai số là: " + remainder);

        if (number1 > number2) {
            System.out.println(number1 + " lớn hơn " + number2);
        } else if (number1 < number2) {
            System.out.println(number1 + " nhỏ hơn " + number2);
        } else {
            System.out.println("Hai số bằng nhau");
        }
    }
}

