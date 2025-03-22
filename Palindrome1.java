public class Palindrome1 {
    public static void main(String[] args){
       for(int n=1;n<1000;n++){
       int a=n;
       int b=0;
       while(a>0){
        int r = a%10;
        b=b*10+r;
        a=a/10;}
        if(n==b){
           System.out.println(n);
        }

    }}
}
