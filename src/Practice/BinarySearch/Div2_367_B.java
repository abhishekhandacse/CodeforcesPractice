package Practice.BinarySearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Div2_367_B {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();
        String[] line = br.readLine().split(" ");

        int[] arr=new int[line.length];

        for(int i=0;i< line.length;i++)
            arr[i]=Integer.parseInt(line[i]);

        Arrays.sort(arr);

        int Q=Integer.parseInt(br.readLine());

        while(Q-- >0){
            int val=Integer.parseInt(br.readLine());

            int low=0,high=arr.length-1,mid=0;

            while(low<=high){
                mid= low + (high-low)/2;


                if(arr[mid]<=val){
                    low=mid+1;
                }else{
                    high=mid-1;
                }

            }


            if(high<0) System.out.println(low);
            else if(low > arr.length-1) System.out.println(high+1);
            else System.out.println(low);

        }

    }
}
