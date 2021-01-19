package Div3_693;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class D {

    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int tc=Integer.parseInt(br.readLine());


        for(int tt=0;tt<tc;tt++) {
            br.readLine();
            String[] line = br.readLine().split(" ");


            int[] arr=new int[line.length];
            for(int i=0;i<line.length;i++){
                arr[i]=Integer.parseInt(line[i]);
            }

//            Arrays.sort(arr);
            ruffleSort(arr);
            long ascore=0,bscore=0;

            boolean turn=true;
            for(int i=arr.length-1;i>=0;i--){
                if(turn){
                    if(arr[i]%2==0){
                        ascore+=arr[i];
                    }
                }else{
                    if(arr[i]%2==1){
                        bscore+=arr[i];
                    }
                }

                turn=!turn;
            }

            if(ascore>bscore) System.out.println("Alice");
            else if(bscore>ascore) System.out.println("Bob");
            else System.out.println("Tie");


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
