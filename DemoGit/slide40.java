
import java.util.Scanner;

public class WeekdayFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao mot so ngay (1-7): ");
        int day = scanner.nextInt();

        String weekday;

        switch (day) {
            case 1:
                weekday = "CN";
                break;
            case 2:
                weekday = "Thu Hai";
                break;
            case 3:
                weekday = "Thu Ba";
                break;
            case 4:
                weekday = "Thu Tu";
                break;
            case 5:
                weekday = "Thu Nam";
                break;
            case 6:
                weekday = "Thu Sau";
                break;
            case 7:
                weekday = "Thu Bay";
                break;
            default:
                weekday = "Khong hop le";
                break;
        }

        System.out.println("Ngay tuong ung la: " + weekday);

        scanner.close();
    }
}

