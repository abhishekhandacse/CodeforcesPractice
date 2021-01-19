package Div3_693;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int tc=Integer.parseInt(br.readLine());


        for(int tt=0;tt<tc;tt++){
           int n=Integer.parseInt(br.readLine());
           String[] line=br.readLine().split(" ");
           int ones=0,twos=0;
           for(int i=0;i< line.length;i++){
               if(line[i].equals("1")){
                   ones++;
               }else
                   twos++;
           }

           if(ones==0){
               if(twos%2==0)
                   System.out.println("YES");
               else
                   System.out.println("NO");
           }else if(twos==0){
               if(ones%2==0)
                   System.out.println("YES");
               else System.out.println("NO");
           }else if(ones%2==0 && twos%2==0){
               System.out.println("YES");
           }
           else{
               if(ones%2==0 && twos%2!=0){
                   System.out.println("YES");
               }else if( ones%2 !=0 && twos%2==0){
                   System.out.println("NO");
               }else{
                   System.out.println("NO");
               }
           }


        }
    }
}
