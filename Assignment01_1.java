public class Assignment01_1 {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố < 1000 :");
        for( int i = 0 ; i<1000; i++){
            if (primeNumber(i)) {
                System.out.println(i+" ");
            }
        }
    }
    public static boolean  primeNumber(int x){
        if (x < 2){
            return  false;
        }
        int squareRoot= (int) Math.sqrt(x);
        for (int i =2; i<= squareRoot ; i++){
            if(x % i ==0){
                return  false;
            }
        }
        return  true;
    }
}
