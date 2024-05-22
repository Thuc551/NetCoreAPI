import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu trong day so: ");
        int n = scanner.nextInt();

        System.out.println("Nhap vao day so nguyen:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            numbers.add(num);
        }

        int max = Collections.max(numbers);
        System.out.println("So nguyen lon nhat trong day: " + max);

        System.out.print("Nhap vao so nguyen can xoa: ");
        int deleteNum = scanner.nextInt();
        numbers.removeIf(num -> num == deleteNum);

        Collections.sort(numbers);
        System.out.println("Day so sau khi sap xep:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}