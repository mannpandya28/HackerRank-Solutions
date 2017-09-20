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
public class BonAppetit {
    
    static int bonAppetit(int n, int k, int b, int[] ar) {
        // Complete this function
        int combined = 0;
        int anna = 0;
        for(int i=0;i<ar.length;i++)
        {
            if(i!=k)
            {
                combined+=ar[i];
            }
            else
            {
                anna+=ar[i];
            }
           
        }
         if(b== combined/2)
         {
                return 0;
         }
            else
            {
                //System.out.println(combined);
                //System.out.println(anna);
                return b-combined/2;
            }
       
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        int result = bonAppetit(n, k, b, ar);
        if(result!=0)
        System.out.println(result);
        else
            System.out.println("Bon Appetit");
    }
}
