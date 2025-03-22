public class Factroial {
    public static void main(String[] args){
        for(int n=2;n<=1000;n++){
        int a = 1;
        for(int i=2;i<=n;i++){
            a*=i;
        }
        System.out.println(a);}
    }
}
