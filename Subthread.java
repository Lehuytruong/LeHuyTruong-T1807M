package Lap03;

public class Subthread implements Runnable{
    @Override
    public void run(){
        int x = 10;
        for(int i=x; i>0; i-- ){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("HẾT GIỜ");
    }
}
