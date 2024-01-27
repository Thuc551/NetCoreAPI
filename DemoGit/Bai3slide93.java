
import java.util.Scanner;
import java.time.Year;

public class TuoiNguoi {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên của bạn: ");
        String ten = sc.nextLine();

        System.out.print("Nhập năm sinh của bạn: ");
        int namSinh = sc.nextInt();

        int tuoi = Year.now().getValue() - namSinh;

        if (tuoi < 16) {
            System.out.println("Bạn " + ten + " ở độ tuổi vị thành niên.");
        } else if (tuoi < 18) {
            System.out.println("Bạn " + ten + " ở độ tuổi trưởng thành.");
        } else {
            System.out.println("Bạn " + ten + " đã già.");
        }

        sc.close();
    }
}

