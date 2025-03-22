public class armstrong {
    public static void main(String[] args) {
        for (int number = 1; number <= 1000; number++) {
            int originalNumber = number, remainder, result = 0;
            int numDigits = String.valueOf(number).length(); 
            while (originalNumber != 0) {
                remainder = originalNumber % 10; 
                result += Math.pow(remainder, numDigits); 
                originalNumber /= 10;
            }
                        
            if (result == number) {
                System.out.println(number + " is an Armstrong number.");   
            }
        }
    }
}
