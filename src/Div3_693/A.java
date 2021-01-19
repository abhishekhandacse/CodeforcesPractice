package Div3_693;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class A {

    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int tc=Integer.parseInt(br.readLine());

        int w,h,n;
        for(int tt=0;tt<tc;tt++){
            String[] line=br.readLine().split(" ");
            w=Integer.parseInt(line[0]);
            h=Integer.parseInt(line[1]);
            n=Integer.parseInt(line[2]);
            int count=1;
            while(count<n){
                if(w%2==0)
                    w=w/2;
                else if(h%2==0)
                    h=h/2;
                else
                    break;
                count=count*2;
            }
            if(count>=n)
                System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
