import java.util.Scanner;

public class HinhChuNhat extends Hinhhoc {
    public float dai;
    public float rong;

    public HinhChuNhat(){
        ten = "Hinh Chu Nhat";
    }
    public void nhapChieuDai(){
        System.out.println("Chieu Dai = ");
        Scanner scanner = new Scanner(System.in);
        dai = scanner.nextFloat();
    }
    public void nhapChieuRong(){
        System.out.println("Chieu Rong = ");
        Scanner scanner = new Scanner(System.in);
        dai = scanner.nextFloat();
    }
    public void tinhChuVi(){
        chuVi = 2 *(dai + rong);
    }
    public void tinhDienTich(){
        dienTich = dai * rong;
    }
}