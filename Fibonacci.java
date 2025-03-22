public class Fibonacci {
    public static void main(String[] args){
        int n = 10;
        int num1 = 0;
        int num2 = 1;
        int nextNum = num2;
        int count = 1;
        while (count<=n){
            System.out.println(nextNum);
            count+=1;
            num1=num2;
            num2=nextNum;
            nextNum=num1+num2;
        }


    }
}
