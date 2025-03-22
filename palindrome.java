public class palindrome {
    public static void main(String[] args) {
        int num = 321 , revnum = 0, remainder;
        int originalnum = num;
        while (num != 0) {
            remainder = num % 10; // 454 % 10 = 4 , 45 % 10 = 5 , 4 % 10 = 4
            System.out.println("remainder"+remainder);
            revnum = revnum * 10 + remainder; //0 * 10 + 4 = 4 , 4 * 10 + 5 = 45 , 45 * 10 + 4 = 454
            System.out.println("revunm"+revnum);
            num /= 10; // 454 / 10 = 45 , 45 / 10 = 4, 4 / 10 = 0 
            System.out.println("num"+num);
          }
          if (originalnum == revnum) {
            System.out.println(originalnum + " is Palindrome.");
          }
          else {
            System.out.println(originalnum + " is not Palindrome.");
          }
    }
    
}
