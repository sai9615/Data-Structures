import java.util.*;

public class matrixProd {

    public static void main(String[] args) {
        int mat[][] = { { -1, 2, 3 }, 
        { 4, 5, -6 }, 
        { 7, 8, 9 } }; 
        matrixProd ob = new matrixProd();
        System.out.println(ob.largeProd(mat)); 
    }

    public int largeProd(int [][] matrix){
        int [][] max = new int[matrix.length][matrix[0].length];
        int [][] min = new int[matrix.length][matrix[0].length];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                int maxVal = Integer.MIN_VALUE;
                int minVal = Integer.MAX_VALUE;
                if(i==0 && j==0){
                    maxVal = matrix[i][j];
                    minVal = matrix[i][j];
                } 
                if(i>0) {
                    int tempMax = Math.max(matrix[i][j] * max[i-1][j], matrix[i][j] * min[i-1][j] );
                    maxVal = Math.max(tempMax, maxVal);
                    int tempMin = Math.min(matrix[i][j] * max[i-1][j], matrix[i][j] * min[i-1][j] );
                    minVal = Math.min(tempMin, minVal);
                }
                if (j>0) {
                    int tempMax = Math.max(matrix[i][j] * max[i][j-1], matrix[i][j] * min[i][j-1] );
                    maxVal = Math.max(tempMax, maxVal);
                    int tempMin = Math.min(matrix[i][j] * max[i][j-1], matrix[i][j] * min[i][j-1] );
                    minVal = Math.min(tempMin, minVal);
                }
                max[i][j] = maxVal;
                min[i][j] = minVal;
            }
        }
        return max[max.length-1][max.length-1];
    }

}