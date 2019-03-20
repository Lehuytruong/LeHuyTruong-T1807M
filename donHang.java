package Assignment04;
import java.util.ArrayList;

public class donHang {



    public class donhang {
        ArrayList<product> ProductList = new ArrayList<>();
        int ID;
        int TongTien;

        donhang(){
            this.ID = (int)(Math.random()*9);
        }
        public  void  AddSanPham(product prd){
            if(prd.getSoLuong()>0)
                ProductList.add(prd);
            if(prd.getKhuyenMai()!=0){
                this.TongTien += prd.getGiaTien() *(100 - prd.getKhuyenMai()/100);
            } else if (prd.getKhuyenMai()==0)
                this.TongTien += prd.getGiaTien();
            else
                System.out.println("Sản phẩm đã hết hàng");
        }

        public  void  printDonHang() {
            for (product donHang : ProductList ){
                System.out.println(donHang.getTên() +",ID"+ donHang.getID());
                System.out.println("giá "+ donHang.getGiaTien()+ "khuyến mãi"+donHang.getKhuyenMai());
            }
            System.out.println("Tổng tiền "+this.TongTien);
        }

        public static void main(String[] args) {
            donHang dh = new donHang();
            product sp1 = new product(5,0);
            product sp2= new product(2,20);
            product sp3 = new product(0,0);
        }
    }
}
