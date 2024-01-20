
import java.util.Scanner;

public class GiaiPhuongTrinhBac2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào hệ số a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập vào hệ số b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập vào hệ số c: ");
        double c = scanner.nextDouble();

        giaiPhuongTrinhBac2(a, b, c);
    }

    public static void giaiPhuongTrinhBac2(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có hai nghiệm phân biệt:");
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép:");
            System.out.println("x = " + x);
        } else {
            System.out.println("Phương trình vô nghiệm.");
        }
    }
}
