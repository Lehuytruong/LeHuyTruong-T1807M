package Assiment03;

public class main_HinhChuNhat {
    public static void main(String[] args) {
        HinhChuNhat hinhChuNhat = new HinhChuNhat();

        // nhập chiều dài và chiều rộng hình chữ nhật
        hinhChuNhat.nhap();

        // hiển thị chiều dài và chiều rộng
        hinhChuNhat.HienThi(hinhChuNhat.ChieuDai, hinhChuNhat.ChieuRong);

        // tính chu vi và diện tích
        double chuVi = hinhChuNhat.tinhChuVi(hinhChuNhat.ChieuDai, hinhChuNhat.ChieuRong);
        double dienTich = hinhChuNhat.tinhDienTich(hinhChuNhat.ChieuDai, hinhChuNhat.ChieuRong);

        // hiển thị chu vi và diện tích
        hinhChuNhat.hienthiChuVivaDienTich(chuVi, dienTich);
    }
}
