import java.util.Scanner;

public class HinhTru extends HinhTron {
    public float chieuCao;

     public HinhTru(){
        ten = "Hinh Tru";
     }
     public void nhapchieuCao(){
            nhapBanKinh();

            System.out.print("chieu cao =");
            Scanner scanner = new Scanner(System.in);
            chieuCao = sc.nextFloat();
     }
     public void tinhTheTich(){
        tinhDienTich();
        theTich = DienTich * chieuCao;
     }
 }