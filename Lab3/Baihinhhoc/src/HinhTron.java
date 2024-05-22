import java.util.Scanner;

public class HinhTron extends Hinhhoc {
    public float BanKinh;
    public HinhTron(){
        ten = "Hinh Tron";
    }

    public void nhapBanKinh(){
        System.out.println("Ban Kinh = ");
        Scanner scanner = new Scanner(System.in);
        BanKinh = sc.nextFloat();
    }
    public void tinhChuVi(){
        ChuVi = 2 * PI * BanKinh;
    }
    public void tinhdientich(){
       DienTich = PI * BanKinh * BanKinh;
    }
}