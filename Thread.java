package Assignment03;

public class Thread extends java.lang.Thread {
    @Override
    public void run() {
        for (int i=1;i<=50;i++){
            try{
                System.out.println(i);
                java.lang.Thread.sleep(1000);

            }catch (Exception e){}
        }
    }
}
