public class List{
    public static void main(String[] args){ 
        int[] a = {1,2,3,1,2};
        for(int i=0; i< a.length; i++){//1
             for(int j=a.length-1; j > i ; j--){//2
                if(a[i] == a[j]){
                    System.out.println(a[j]);
                   break;
                }

            }

        }


    }
}
