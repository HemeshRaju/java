import java.util.*;

public class Armstrong1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length:");
        int len = scanner.nextInt();
        System.out.print("Enter the number:");
        int n = scanner.nextInt();
        
        int originalNumber = n;
        int sum = 0;
        
        while (n != 0) {
            int r = n % 10;
            sum += Math.pow(r, len);
            n /= 10;
        }
        
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        } 
    }
}
    

    