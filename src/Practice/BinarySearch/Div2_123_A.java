package Practice.BinarySearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Div2_123_A {

    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        String[] line=br.readLine().split(" ");
        int a=Integer.parseInt(line[0]);
        int b=Integer.parseInt(line[1]);
        int c=Integer.parseInt(line[2]);

        int ans= (int)Math.ceil( ( (double)(a*c)/(double)b) );
//        System.out.println(ans);
        System.out.println(ans-c);
    }

}
