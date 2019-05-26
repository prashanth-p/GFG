/* O(log n) Fibo Solution */

import java.io.*;
import java.util.*;


class GFG {
    public static void printMat(int[][] F) {
        int len = F.length;
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++) {
                System.out.print(F[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void matMultiply(int[][] F, int[][] M) {
        int a,b,c,d;
        a = F[0][0]*M[0][0] + F[0][1]*M[1][0];
        b = F[0][0]*M[0][1] + F[0][1]*M[1][1];
        c = F[1][0]*M[0][0] + F[1][1]*M[1][0];
        d = F[1][0]*M[0][1] + F[1][1]*M[1][1];
        
        F[0][0] = a;
        F[0][1] = b;
        F[1][0] = c;
        F[1][1] = d;
        
        // return F;
    }
    public static void matPow(int[][] F, int n) {
        if( n == 0 || n == 1)
          return;
        int M[][] = new int[][]{{1,1},{1,0}};
         
        matPow(F, n/2);
        matMultiply(F, F);
         
        if (n%2 != 0)
           matMultiply(F, M);
        
    }
    public static int fibbo(int n) {
        int[][] F = new int[][] {{1,1},{1,0}};
        if (n == 0)
            return 0;
        matPow(F,n-1);
        printMat(F);
        return F[0][0];
    }

    public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
      int n =sc.nextInt();
      int res = fibbo(n);
      System.out.println(res);
    }
}
