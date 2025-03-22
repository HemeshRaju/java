public class ReversingString {
    public static void main(String[] args){
        int a=123;
        int r=0;
        int b;
        for(int i=0;i<3;i++){
            b=a%10;
            r=b+r*10;
            a=a/10;
        }
        System.out.println(r);
    }
}
