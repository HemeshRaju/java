public class Add2 {
    public static void main(String[] args) {
        int i=12345;
        int a=(i%10)+1;
        i=i/10;
        int b=(i%10)+1;
        i=i/10;
        int c=(i%10)+1;
        i=i/10;
        int d=(i%10)+1;
        i=i/10;
        int e=(i%10)+1;
        int total=e*10000+d*1000+c*100+b*10+a;
        System.out.print(total);
        //System.out.print(d);
        //System.out.print(c);
        //System.out.print(b);
        //System.out.print(a);
    }
}
