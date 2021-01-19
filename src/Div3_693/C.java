package Div3_693;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class C {

    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int tc=Integer.parseInt(br.readLine());


        for(int tt=0;tt<tc;tt++){
            br.readLine();
            String[] line=br.readLine().split(" ");
            int[] arr=new int[line.length];
            for(int i=0;i<line.length;i++)
                arr[i]=Integer.parseInt(line[i]);

            int[] aux=new int[line.length];
            int max=0;
            for(int i=aux.length-1;i>=0;i--){
                if(arr[i]+i>arr.length-1)
                    aux[i]=arr[i];
                else
                    aux[i]=arr[i]+aux[arr[i]+i];

                max=Math.max(max,aux[i]);
            }

            System.out.println(max);

        }
    }
}
