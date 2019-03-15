package Assiment03;
import java.util.Scanner;
public class HinhChuNhat {
    protected double ChieuDai, ChieuRong, ChuVi, DienTich;
    Scanner scanner = new Scanner(System.in);

    public void nhap(){
        do{
            System.out.println("Nhap chieu dai:");
            ChieuDai = scanner.nextDouble();
            System.out.println("Nhap chieu rong:");
            ChieuRong = scanner.nextDouble();
        } while (ChieuRong < ChieuDai);
    }
    public void HienThi(double Dai, double Rong){
        System.out.println("Chieu dai va rong cua hinh chu nhat: "
                + ChieuDai+"va"+ChieuRong);
    }
    public double tinhChuVi (double Dai, double Rong){
        ChuVi = (Dai + Rong)*2;
        return ChuVi;
    }
    public double tinhDienTich(double Dai, double Rong){
        DienTich = Dai*Rong;
        return DienTich;
    }
    public void hienthiChuVivaDienTich(double CV, double DT){
        System.out.println("Chu vi hinh chu nhat la: "+CV);
        System.out.println(("Dien tich hinh chu nhat la: "+DT));
    }

}
