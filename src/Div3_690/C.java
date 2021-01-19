package Div3_690;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class C {

    static int isRepating(int num){
        if(num>=1 && num<=9)return num;

        boolean[] hm=new boolean[10];

        int sum=0;
        while(num>0){
            if(hm[num%10])return Integer.MAX_VALUE;
            hm[num%10]=true;
            sum=sum+num%10;
            num=num/10;
        }

        return sum;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int tc=Integer.parseInt(br.readLine());

        int[] ans=new int[]{0,
            1,
            2,
            3,
            4,
            5,
            6,
            7,
            8,
            9,
            19,
            29,
            39,
            49,
            59,
            69,
            79,
            89,
            189,
            289,
            389,
            489,
            589,
            689,
            789,
            1789,
            2789,
            3789,
            4789,
            5789,
            6789,
            16789,
            26789,
            36789,
            46789,
            56789,
            156789,
            256789,
            356789,
            456789,
            1456789,
            2456789,
            3456789,
            13456789,
            23456789,
            123456789,
            0,
            0,
            0,
            0,
        };
        /*int num=0;
        for(int i=1;i<=123456789;i++){
            int sum=isRepating(i);
            if(sum!=Integer.MAX_VALUE){
                if(ans[sum]==0){
                    ans[sum]=i;
                    num++;
                }

                if(num>50)break;

            }
        }*/

//        for(int i:ans)
//            System.out.println(i);

        for(int T=0;T<tc;T++){

            int nums=Integer.parseInt(br.readLine());

            if(nums>45) System.out.println(-1);
            else System.out.println(ans[nums]);

        }
    }
}
