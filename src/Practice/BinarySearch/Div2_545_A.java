package Practice.BinarySearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Div2_545_A {
    public static void main(String[] args) throws Exception {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        int tc=Integer.parseInt( br.readLine());

//        for(int tt=0;tt<tc;tt++){
            br.readLine();
            String[] line=br.readLine().split(" ");

            int[] oneL=new int[line.length];
            int[] twoL=new int[line.length];

            int[] oneR=new int[line.length];
            int[] twoR=new int[line.length];

            int ones=0, twos=0;
            int leftAns=0,rightAns=0;
            for(int i=0;i< line.length;i++){
                if(line[i].equals("1")){
                    ones++;
                    twos=0;
                    oneL[i]=ones;
                }else{
                    ones=0;
                    twos++;
                    twoL[i]=twos;
                }
            }
            ones=0;twos=0;
            for(int i= line.length-1;i>=0;i--){
                if(line[i].equals("1")){
                    ones++;
                    twos=0;
                    oneR[i]=ones;
                }else{
                    ones=0;
                    twos++;
                    twoR[i]=twos;
                }
            }

            for(int i=0;i< line.length-1;i++){
                leftAns=Math.max(leftAns,Math.min(oneL[i],twoR[i+1]));
            }

            for(int i= line.length-1; i>0;i--){
                rightAns=Math.max(rightAns,Math.min(oneR[i],twoL[i-1]));
            }

            System.out.println(Math.max(leftAns,rightAns)*2);

        }

//    }
}
