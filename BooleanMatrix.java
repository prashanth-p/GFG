/* 
    * Boolean Matrix Solution
    * Code by Prashanth Pradeep
    * 28-May-2019
*/

import java.io.*;
import java.util.Arrays;

class Util
{
    // Print the matrix
    public static void printMat(int[][] mat){
        int m = mat.length;
        int n = mat[0].length;
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(mat[i][j] + "  " );
            }
            System.out.println();
        }
        System.out.println();
    }
    
	// Function to convert the matrix
	private static void convert(int[][] mat)
	{
		int r = mat.length;
		int c = mat[0].length;
		
		boolean rowFlag=false, colFlag=false;
		printMat(mat);
		
		for(int i : mat[0]) {
		    if(i == 0 ){
		        rowFlag = true;
		        break;
		    }
		}
		
		for(int[] j : mat ) {
		    if(j[0] == 0 ){
		        colFlag = true;
		        break;
		    }
		}
		
		if(rowFlag){
		    System.out.println("1st Row has zeros");
		}if(colFlag){
		    System.out.println("1st Col has zeros");
		}
		
		System.out.println();
		 
		for(int i=1; i<r; i++){
		    for(int j=1; j<c; j++){
		        if(mat[i][j] == 0) {
		            mat[i][0] = 0;
		            mat[0][j] = 0;
		        }
		    }
		}
// 		printMat(mat);
		
		for(int i=1; i<r; i++){
		    if(mat[i][0] == 0 ){
		        for(int j=1; j<c; j++){
		            mat[i][j] = 0;
		        }
		    }
		}
// 		printMat(mat);
		
		for(int j=1; j<c; j++){
		    if(mat[0][j] == 0 ){
		        for(int i=1; i<r; i++){
		            mat[i][j] = 0;
		        }
		    }
		}
		
// 		printMat(mat);
		
		if(rowFlag){
		    for(int j=0; j<c; j++){
		        mat[0][j] = 0;
		    }
		}
		
// 		printMat(mat);
		
		if(colFlag){
		    for(int i=0; i<r; i++){
		        mat[i][0] = 0;
		    }
		}
// 		printMat(mat);
	}

	// main function
	public static void main(String[] args)
	{
		int[][] mat =
		{
			{ 5, 3, 1, 8, 1 },
			{ 8, 1, 8, 4, 7 },
			{ 2, 6, 5, 0, 3 },
			{ 1, 4, 2, 7, 9 },
			{ 1, 1, 3, 6, 5 }
		};

		// Print before converting to boolean
		printMat(mat);
		
		// convert the matrix
		convert(mat);

		// print matrix
		printMat(mat);
	}
}
