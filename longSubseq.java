import java.util.*;

public class longSubseq {

    public static void main(String[] args) {
        int mat[] =  { 1, 2, 3, 2,3};
        longSubseq ob = new longSubseq();
        int count = ob.longSub(mat);
        System.out.println(count);
    }

    public int longSub(int [] arr){
        HashSet <Integer> hash = new HashSet<>();
        for(int i : arr){
            hash.add(i);
        }
        
        int maxLength =0;
        for(int elem: hash){
            int length = 0;
            if(hash.contains(elem-1)){
                continue;
            }
            while(hash.contains(elem++)){
            length++;
            }
            maxLength = Math.max(maxLength, length);
        }
        return maxLength;
    }
}