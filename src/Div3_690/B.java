package Div3_690;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B {


    static boolean dp(String str,int i,int len, StringBuilder temp,int attempts,int call){
//                    System.out.println(temp + " attempts "+attempts);
                    if(attempts>2)return false;
                    if(temp.length()>4)return false;


                    if(i==len){
                        if(temp.toString().equals("2020"))return true;
                        return false;
                    }

                    //inclusion
                    temp.append(str.charAt(i));
                    boolean incl=dp(str,i+1,len,temp,( (call==1)?attempts:(attempts+1) ),1);
                    //System.out.println("Inclused-> "+temp);
                    temp.setLength(temp.length()-1);
                    //exclusion

                    boolean excl=dp(str,i+1,len,temp,( (call==0)?attempts:(attempts+1) ),0);
                    //System.out.println("Excluded-> "+temp);
                    return incl||excl;

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int tc=Integer.parseInt(br.readLine());

        for(int T=0;T<tc;T++){
            br.readLine();
            String nums=br.readLine();

            if(dp(nums,0,nums.length(),new StringBuilder(""),0,1))
                System.out.println("YES");
            else System.out.println("NO");

        }
    }
}
