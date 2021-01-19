package Practice.BinarySearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Div3_634_C {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int Tc=Integer.parseInt(br.readLine());
        while(Tc-- > 0){
            br.readLine();
            String[] line=br.readLine().split(" ");

            if(line.length==1){
                System.out.println(0);
                continue;
            }

            int[] hm=new int[2*100009];

            int unique=0,repeat=0;

            for(int i=0;i< line.length;i++){
                int val=Integer.parseInt(line[i]);
                hm[val]+=1;

                if(hm[val]==1)
                    unique++;

                if(hm[val]>1)
                    repeat=Math.max(repeat,hm[val]-1);
            }


//            System.out.println(unique + "--" + repeat);
            /*for(int i=0;i<2*100009;i++){

            }*/

            if(unique== line.length){
                System.out.println(1);
                continue;
            }

            System.out.println(Math.max(Math.min(unique-1,repeat+1),Math.min(unique,repeat)) );

        }
    }
}
