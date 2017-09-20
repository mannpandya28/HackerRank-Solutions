/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author abc
 */
public class AppleAndOranges {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        //solution
        int acount =0;
        int ocount =0;
        for(int i=0;i<m;i++)//apple
        {
            if(apple[i]+a>=s &&apple[i]+a<=t)
                acount++;
            
        }
        for(int i=0;i<n;i++)
        {
            if(orange[i]+b>=s && orange[i]+b<=t)
                ocount++;
        }
        System.out.println(acount);
        System.out.println(ocount);
        
    }
}
