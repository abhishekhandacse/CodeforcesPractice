package Practice.BinarySearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Div3_481_C {

    static int binSearch(long[] arr,long key){

                int low=0,high=arr.length-1;

                while(low<=high){
                    int mid= low + (high-low)/2;

                    if(arr[mid]==key)return mid;
                    if(arr[mid]<key)
                        low=mid+1;
                    else
                        high=mid-1;
                }

                return low;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int D,L;
        String[] line=br.readLine().split(" ");
        D=Integer.parseInt(line[0]);
        L=Integer.parseInt(line[1]);

        long[] rooms=new long[D+1];
        line=br.readLine().split(" ");

        for(int i=1;i<D+1;i++){
            long r=Long.parseLong(line[i-1]);
            rooms[i]=rooms[i-1]+r;
        }

        line=br.readLine().split(" ");
        for(int i=0;i<L;i++){
            long letter=Long.parseLong(line[i]);

            int dorm=binSearch(rooms,letter);

            System.out.print(dorm+" ");
            System.out.println(letter-rooms[dorm-1]);

        }




    }
}
