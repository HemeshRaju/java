public class Remove {
    public static void main(String[] args){
        String a="abcde";
        String b="abc";
        String[] arr1 = a.split("");
        //System.out.println(arr1[1]);
        String[] arr2 = b.split("");
        //System.out.println(arr2[2]);
        for(int i=0;i<a.length();i++){
            for(int j=0;j<b.length();j++){
            if (arr1[i]==arr2[j]){
                int samest=i;
            }
        }}
    }
}
