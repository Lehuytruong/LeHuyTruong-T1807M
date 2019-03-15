package Assiment03;
import java.util.Scanner;
public class TamGiac {
    public static void main(String[]args){
        int a,b,c;
        float cv,s;
        a=NhapSoNguyen("Nhap canh a:");
        b=NhapSoNguyen("Nhap canh b:");
        c=NhapSoNguyen("Nhap canh c:");
        cv=ChuVi(a,b,c);
        s=DienTich(a,b,c);
        System.out.println("Chu vi hinh tam giac: "+cv);
        System.out.println("Dien tich hinh tam giac: "+s);
    }
    public static int NhapSoNguyen(String str){
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println(str);
        x = sc.nextInt();
        return x;
    }
    public static float ChuVi(int a, int b, int c){
        return a+b+c;
    }
    public static float DienTich(int a, int b, int c){
        float p =(float)(a+b+c)/2;
        float sd;
        sd=(float)Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return sd;
    }
}
