package Div3_693;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class E {
    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int tc=Integer.parseInt(br.readLine());


        for(int tt=0;tt<tc;tt++) {
            int n=Integer.parseInt(br.readLine());

            ArrayList<Pair> dimensions=new ArrayList<>();

            for(int i=0;i<n;i++){
                String[] line = br.readLine().split(" ");
                int w=Integer.parseInt(line[0]);
                int h=Integer.parseInt(line[1]);
                dimensions.add(new Pair(w,h,i));
                dimensions.add(new Pair(h,w,i));
            }

            Collections.sort(dimensions,(p1,p2)->{
                if(p1.w<p2.w)return -1;
                else if(p1.w>p2.w)return 1;
                else{
                    if(p1.h<p2.h)return 1;
                    else if(p1.h > p2.h)return -1;
                    else return 0;
                }
            });// Dimension array would be in order min wid and max height first and increasing width and decreasing height


            int[] result=new int[n];
            Arrays.fill(result,-1);

            int minHeight=Integer.MAX_VALUE;
            int minIndex=0;

            for(Pair p:dimensions){
                if(minHeight > p.h ){
                    minHeight=p.h;
                    minIndex=p.i;
                }else if (minHeight < p.h){
                    result[p.i]=minIndex+1;
                }
            }

            for(int i:result)
                System.out.print(i+" ");

            System.out.println();
        }



    }
}

class Pair{
    int w;
    int h;
    int i;

    Pair(int w,int h, int i){
        this.w=w;
        this.h=h;
        this.i=i;
    }
}
// (3,4) (5,4) (3,3) (4,3) (4,5) (3,3)
// (3,4) (3,3) (3,3) (4,5) (4,3) (5,4)