import java.util.*;

public class findElemMatrix{

    public static void main(String[] args) {
        int mat[][] = { { 1, 2, 3 }, 
        { 4, 5, 6 }, 
        { 7, 8, 9 } }; 
        int elem  = 10;
        findElemMatrix ob = new findElemMatrix();
        if(ob.findElem(mat, elem)) System.out.println("true");   
        else {
            System.out.println("false");
        }  
    }

    public boolean findElem(int [][] arr, int elem){
        int row=0;
        int col = arr[0].length - 1;
        boolean found = false;
        while((row < (arr.length-1)) && col > 0 ){
            if(arr[row][col] < elem) row++;
            if(arr[row][col] == elem) { found = true; 
                break; }
            else {
                col--;
            }
        }
        return found;
    }

}