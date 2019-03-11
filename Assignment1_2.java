public class Assignment1_2 {
    public static  int fibonacciLoop(int number){
        int sum=0;
        int f1= 0,f2=1;
        int fn;
        if(number==1){
            sum=0;
        }else if(number == 2){
            sum=1;
        }else  {
            for(int i=3; i<=number ; i++){
                fn =f1 + f2;
                f1 = f2;
                f2 = fn;
                sum += fn;
            }
        }
        return  sum;

    }

    public static void main(String[] args) {
        System.out.println("Tổng 20 số đầu trong dãy số fibonacci là:"+ fibonacciLoop(20));
    }
}
