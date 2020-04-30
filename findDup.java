import java.util.*;

public class findDup{
    public static void main(String[] args) {
        int mat[] =  { 1, 2, 3, 2,3};
        findDup ob = new findDup();
        int [] arr = ob.duplicates(mat);
        for(int i=0; i<arr.length; i++){
            if(arr[i] >= 2){
                System.out.println(
                    i);
            } else {
                continue;
        }
    }
    }

    public int [] duplicates (int [] arr){
        int [] dups = new int[arr.length];
        for(int i=0; i<dups.length; i++){
            dups[i] = 0;
        }
        for(int i=0; i<arr.length; i++){
            dups[arr[i]] += 1; 
        }
        return dups;
    }
}