public class Prime1 {
    public static void main(String[] args) {

        for(int j=1;j<1000;j++){
        int num = j;
        if (num > 1) {
            boolean isPrime = true;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("prime "+j);
            } else {
                
            }
        } else {
        
        }
    }
 }}


    