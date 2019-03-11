package LAP02;

import java.util.Scanner;

public class Student {
    int MaSinhVien;
    double DiemTrungBinh;
    int age;
    int Class;
    void  inputInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Mã sinh viên :");
        MaSinhVien = scanner.nextInt();
        System.out.println("Nhập điểm trung bình :");
        DiemTrungBinh = scanner.nextDouble();
        System.out.println("Nhập Tuổi : ");
        age = scanner.nextInt();
        System.out.println("Nhập Lớp: ");
        Class = scanner.nextInt();
    }
    void  ShowInfo(){
        System.out.println("Mã Sinh viên :"+ MaSinhVien +"Điểm trung bình :"+DiemTrungBinh );
        System.out.println("Tuổi : "+age + "Lớp :"+ Class);
    }
    public int getMaSinhVien() {
        return MaSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        MaSinhVien = maSinhVien;
    }

    public double getDiemTrungBinh() {
        return DiemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        DiemTrungBinh = diemTrungBinh;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    String setHocBong(){
        if(DiemTrungBinh>8.0){
            return  "Sinh viên đạt được học bổng";
        }else
            return "Sinh Viên không đạt được học bổng";
    }
    public static void main(String[] args) {
        Student Sv = new Student();
        Sv.inputInfo();
        Sv.ShowInfo();
        System.out.println(Sv.setHocBong());
    }
}

