/* 
    * Pair in Array with sum K Solution
    * Code by Prashanth Pradeep
    * 28-May-2019
*/

import java.io.*;
import java.util.*;
import java.lang.*;


class GFG {
	public static void main (String[] args) {
		System.out.println("GfG!");
        Scanner sc = new Scanner(System.in);
        List<Integer> arrList = new ArrayList<Integer> ();
        
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int k = 6;
        System.out.println(n);
        
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if((arr[i]+arr[j]) == k){
                    if(arrList.contains(arr[i]) || arrList.contains(k-arr[i])){
                        continue;
                    }
                    else {
                        arrList.add(arr[i]);
                    }
                }
            }
        }
        
        for(int i: arrList){
            System.out.println(i + " " + (k-i));
        }
	}
}
