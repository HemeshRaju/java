public class evenOrOdd {

    public boolean cheak(int n){
        if(n%2==0){
            return true;
        }
        else{
            return false;
            }
    }
    public static void main(String[] args) {
        int n = 12345678;
        evenOrOdd obj = new evenOrOdd();
        int even = 0;
        int odd = 0;

        while (n>0){
            int rem = n%10;

            if(obj.cheak(rem)){
                even=rem+even;
                }
            else{
                odd=rem+odd;
                }
                n = n/10;


        }
        System.out.println("Total even numbers are "+even);
        System.out.println("Total odd numbers are "+odd);

    }
}
