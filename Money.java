public class Money{
    public static void main(String[] args) {
        int n=123;
        int d500=n/500;
        n=n%500;
        int d200=n/200;
        n=n%200;
        int d100=n/100;
        n=n%100;
        int d50=n/50;
        n=n%50;
        int d20=n/20;
        n=n%20;
        int d10=n/10;
        n=n%10;
        int d5=n/5;
        n=n%5;
        int d2=n/2;
        n=n%2;
        int d1=n/1;
        n=n%1;


        int sum=d500+d200+d100+d50+d20+d10+d5+d2+d1;

        System.out.println("Number of notes"+sum);
        System.out.println("number of 500 notes:"+d500);
        System.out.println("number of 200 notes:"+d200);
        System.out.println("number of 100 notes:"+d100);
        System.out.println("number of 50 notes:"+d50);
        System.out.println("number of 20 notes:"+d20);
        System.out.println("number of 10 notes:"+d10);
        System.out.println("number of 5 coin:"+d5);
        System.out.println("number of 2 coin:"+d2);
        System.out.println("number of 1 coin:"+d1);


        
}

}