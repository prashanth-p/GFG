/* ****************************************************************************************************************************************************************************************
Given an arry A (may contain duplicates) of N elements and a positive integer K. The task is to count the number of elements which occurs exactly floor(N/K) times in the array.
Hint: You may use hashing or brute-force.

Input:
First line of input contains number of testcases. For each testcase, there will be two lines, first of which contains N and K and second line contains array elements.

Output:
For each testcase, print the count of elements in the array which occurs exactly floor(N/K) times.

Constrains:
1 <= T <= 100
1 <= N <= 103
1 <= Ai <= 103

User Task:
Your task is to complete the function countSpecials() which should count the elements which occurs exactly floor(N/K) times.

Example:
Input:
1
5 2
1 4 1 2 4

Output:
2

Explanation:
Testcase 1: In the given array, 1 and 4 occurs floor(5/2) = 2 times. So count is 2.

**************************************************************************************************************************************************************************************** */

//User function Template for Java
/*Class Geeks with countSpecials as its member function
* a : input array
* n : size of array
k : to calculate floor(n/k)
*/
class Geeks{
    static void countSpecials(int a[], int n, int k){
        int f = (int)Math.floor(n/k);
        // your code here
        
        HashMap<Integer,Integer> keyVal = new HashMap<Integer,Integer>();
        for(int i : a) {
            if(keyVal.containsKey(i)) {
                keyVal.put(i,keyVal.get(i)+1);
            }
            else {
                keyVal.put(i,1);
            }
        }
        
        // for(int i: keyVal.keySet()) {
        //     System.out.println(i + ": " + keyVal.get(i));
        // }
        int count = 0;
        // System.out.println(k);
        for(int i : keyVal.keySet()) {
            if(keyVal.get(i)==f) {
                count++;
            }
        }
        System.out.println(count);
    }
}
