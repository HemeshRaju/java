public class Prime {
    public static void main(String[] args){
        int num=2;
        if (num>1){
            for(int i=2;i<=num;i++) {
                if (num%i==0){}
                System.out.println("not a prime");
                return;
            }
            System.out.println("prime");
        }
    }
}
