import java.util.*;
public class MaxSubArray {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String ans = s.nextLine();
        //System.out.println(ans);
        String[] ans1 = ans.split(" ");
        int[] ans2=new int[ans1.length];
        for (int i=0;i<ans1.length;i++){
            ans2[i]=Integer.parseInt(ans1[i]);
        }
        System.out.println(ans2[0]);
    }
}
