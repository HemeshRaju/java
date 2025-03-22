import java.util.*;
//import java.io.*;
public class JojedArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("No of rows :");
        int row = sc.nextInt();
        //System.out.println(row);
        int[][] arr = new int[row][];

        for(int i=0;i<row;i++){
            for(int j=0;j<i.size();j++){
                 arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<i.length();j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
