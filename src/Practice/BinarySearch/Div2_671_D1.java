package Practice.BinarySearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Div2_671_D1 {
    public static void main(String[] args) throws Exception {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        int tc=Integer.parseInt( br.readLine());

//        for(int tt=0;tt<tc;tt++){
        int N=Integer.parseInt(br.readLine());

        String[] line=br.readLine().split(" ");

        if(N<=2){
            System.out.println(0);
        }else{
            if(N%2==0){
                System.out.println((N/2)-1);
            }else{
                System.out.println(N/2);
            }
        }

        int[] arr= new int[line.length];
        for(int i=0;i< line.length;i++){
            arr[i]=Integer.parseInt(line[i]);
        }

        Arrays.sort(arr);

        int start=0, end= arr.length-1;
        boolean turn=true;
        while(start<=end){
            if(turn){
                System.out.print(arr[end]+" ");
                end--;
            }else{
                System.out.print(arr[start]+" ");
                start++;
            }
            turn=!turn;
        }

        System.out.println();

    }
}
