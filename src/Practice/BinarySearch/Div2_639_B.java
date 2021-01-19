package Practice.BinarySearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Div2_639_B {

            static int binSearch(ArrayList<Integer> arr,int key){
                        int low=0,high=arr.size()-1,mid;

                        while(low<=high){
                            mid= low + (high-low)/2;
                            if(arr.get(mid)==key)return mid;
                            if(arr.get(mid)<key)low=mid+1;
                            else high=mid-1;
                        }

                        if(high<0)return -1;

                        return high;

            }
    public static void main(String[] args) throws Exception {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int N=Integer.parseInt(br.readLine());

            int[] arr=new int[N];

            int MAX=0;

            for(int i=0;i<N;i++){
                arr[i]=Integer.parseInt(br.readLine());
                if(MAX< arr[i])
                    MAX=arr[i];
            }

            int SUM=2;
            int add=5;
            ArrayList<Integer> sum=new ArrayList<>();
//            System.out.println(MAX);
            while( (SUM) <= MAX){
                sum.add(SUM);
                SUM=SUM+add;
                add+=3;
            }

//            for(int i:sum)
//                System.out.print(i+"  ");
//            System.out.println();

            for(int i=0;i<arr.length;i++){

                int Q=arr[i];

                int ans=0;

                while(Q>=2){
                    int index=binSearch(sum,Q);
//                    System.out.println(index);
                    if(index==-1)break;
                    ans+=(Q/sum.get(index));
                    Q=Q%sum.get(index);
                }

                System.out.println(ans);


            }


        }

}
