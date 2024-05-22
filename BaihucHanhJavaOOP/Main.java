import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>();

       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong phan tu: ");
        int n = scanner.nextInt();

        System.out.println("Nhap cac phan tu:");

      
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            numbers.add(number);
        }

        
        int max = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            int currentNumber = numbers.get(i);
            if (currentNumber > max) {
                max = currentNumber;
            }
        }

        
        System.out.println("Phan tu lon nhat trong ArrayList la: " + max);
    }
}