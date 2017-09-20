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
public class BreakingTheRecord {
     static int[] getRecord(int[] s){
        // Complete this function
        int[] ans = new int[2];
       int max = s[0];
        int min = s[0];
        int maxbreak =0;
        int minbreak =0;
        for(int i=1;i<s.length;i++)
        {
            if(s[i]>max)
            {
                max = s[i];
                maxbreak++;
            }
            if(s[i]<min)
            {
                min = s[i];
                minbreak++;
            }
        }
        ans[0] = maxbreak;
        ans[1] = minbreak;
        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
    
}
