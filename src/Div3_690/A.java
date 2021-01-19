package Div3_690;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class A {

    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int tc=Integer.parseInt(br.readLine());

        for(int T=0;T<tc;T++){
            br.readLine();
            String[] nums=br.readLine().split(" ");
            String ans="";

            int i=0,j=nums.length-1;

                while(i<=j){
                    if(i==j){
                        ans=ans+nums[i]+" ";
                    }else {
                        ans=ans+nums[i]+" "+nums[j]+" ";
                    }
                    i++;
                    j--;
                }


            System.out.println(ans);
        }
    }

}
