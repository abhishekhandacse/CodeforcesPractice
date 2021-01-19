package Div3_690;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class E1 {

    static long nc2(long n){
        return n*(n-1)/2;
    }

    static int upperBound(int[] arr,int low,int high,int key){
                int mid;
                while(low<=high){
                    mid=low+(high-low)/2;
                    if(arr[mid]<=key)
                        low=mid+1;
                    else high=mid-1;
                }

                if(high>=0)return high;
                return -1;

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int tc=Integer.parseInt(br.readLine());

        for(int tt=0;tt<tc;tt++){
            int size=Integer.parseInt(br.readLine());

            String[] line=br.readLine().split(" ");

            int[] arr=new int[size];

            for(int i=0;i<size;i++){
                arr[i]=Integer.parseInt(line[i]);
            }

            ruffleSort(arr);

            long count=0;


            for(int i=0;i<size;i++){
                int ub=upperBound(arr,i,size-1,arr[i]+2);
//                System.out.println(ub);
                if(ub!=-1)
                    count+=nc2(ub-i);
            }


            System.out.println(count);
        }


    }

    static void ruffleSort(int[] arr){
        Random r=new Random();
        for(int i=0;i<arr.length;i++){
            int j=r.nextInt(arr.length);
            int k=r.nextInt(arr.length);
            int temp=arr[j];
            arr[j]=arr[k];
            arr[k]=temp;
        }
        Arrays.sort(arr);
    }
}
