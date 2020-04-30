import java.util.*;

public class matrixSq {

    public static void main(String[] args) {
        int mat[][] = { { 1, 1, 1 }, 
        { 1, 1, 1 }, 
        { 1, 1, 1 } }; 
        matrixSq ob = new matrixSq();
        System.out.println(ob.largeSq(mat)); 
    }

    public int largeSq(int [][] arr){
        int [][] cache = arr.clone();
        int result =0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(i==0 || j ==0){
                    continue;
                } 
                if(arr[i][j] > 0){
                    cache[i][j] = 1 + Math.min(Math.min(cache[i-1][j], cache[i][j-1]), cache[i-1][j-1]);
                }
                result = Math.max(result, cache[i][j]);
            }
        }
        return result;
    }
}
    