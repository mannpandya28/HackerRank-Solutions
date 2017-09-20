/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author abc
 */
public class MigratoryBirds {
    
    static int migratoryBirds(int n, int[] ar) {
        // Complete this function
        int [] count = new int[ar.length];
        int index =0;
        int max = -999;
        Arrays.fill(count,0);
        for(int i=0;i<ar.length;i++)
        {
            count[ar[i]-1]++;
        }
        for(int i=0;i<count.length;i++)
        {
            if(count[i]>max)
            {
                max = count[i];
                index = i;
            }
        }
        return index+1;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
