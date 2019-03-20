package Assignment04;
    import com.sun.xml.internal.bind.v2.model.core.ID;
    import java.util.ArrayList;
public class product {
    int ID;
    String Tên;
    int giaTien;
    int soLuong;
    int KhuyenMai;

    public int getID() {
        return ID;
    }

    public String getTên() {
        return Tên;
    }

    public int getGiaTien() {
        return giaTien;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public int getKhuyenMai() {
        return KhuyenMai;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setTên(String tên) {
        Tên = tên;
    }

    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setKhuyenMai(int khuyenMai) {
        KhuyenMai = khuyenMai;
    }

    product(int SoLuong, int khuyenMai){
        if(this.soLuong==0) {

            System.out.println("Đã hết hàng");
        }else{
            this.soLuong = SoLuong;
            this.KhuyenMai = khuyenMai;
            this.ID = (int)Math.random()*9;
            this.Tên = "Member"+ (int)Math.random()*9;
            this.giaTien= (int)Math.random()*90000;
            System.out.println("Tên: "+ this.Tên + "ID :"+this.ID);
            System.out.println("Giá tiền gốc: "+giaTien + "Số lượng :"+soLuong);
            System.out.println("Khuyến mãi"+ this.KhuyenMai + "%");
        }
    }

}
