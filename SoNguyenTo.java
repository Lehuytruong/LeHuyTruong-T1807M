package lap_session3;

public class SoNguyenTo {
    int a = 2;
    public SoNguyenTo(){

    }
   /** public SoNguyenTo(int x){
        if (this.isSoNguyenTo(x)){
            this.a =x;
        }else {
            System.out.println("khong phai so nguyen to");
        }

    }
    **/
    public  int getA(){
        return this.a;
    }
    public void setA(){
        if (this.isSoNguyenTo(a)){
            this.a = a;
        }else {
            System.out.println("khong phai so nguyen to");
        }

    }
    public boolean isSoNguyenTo(int x){
        if(x<2) return false;
        if (x==2) return true;
        for (int i=2;i<=x/2;i++){
            if(x%i==0){
                return false;
            }
            return true;
        }
    }
    public int timSoNuyenToTiepTheo(){
        for(int i=this.getA()+1;true;i++){
            if(this.isSoNguyenTo(i)){
                this.setA(i);
                break;
            }
        }
        return this.getA();
    }
}
