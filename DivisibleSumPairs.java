/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

/**
 *
 * @author abc
 */
import java.util.Scanner;
public class DivisibleSumPairs {
    
    static int divisibleSumPairs(int n, int k, int[] ar) {
        // Complete this function
        int count =0;
        for(int i=0;i<ar.length-1;i++)
        {
            for(int j=i+1;j<ar.length;j++)
            {
                if((ar[i]+ar[j])%k==0 && i<j){
                    //System.out.println("i is "+ ar[i] + " and j is " + ar[j]);
                    count++;
                }
            }    
            
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = divisibleSumPairs(n, k, ar);
        System.out.println(result);
    }
    
}
