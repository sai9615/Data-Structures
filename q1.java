import java.util.*;
import java.util.Arrays;

public class q1 {
    private float findMedian(int [] arr1, int [] arr2) {
    int len = arr1.length + arr2.length;
    float median=0;     
    float [] arr3 = new float[len];
    for(int i=0; i<arr1.length; i++){
        arr3[i] = arr1[i];
    }
    for(int i=0; i<arr2.length; i++){
        arr3[i+arr1.length] = arr2[i];
    }
    Arrays.sort(arr3);
    if(arr3.length % 2 == 0) {
        median = (arr3[(len/2)] + arr3[(len/2)-1])/2;
        return median;
    } 
    return median;
}

public static void main(String[] args) {
int arr1[] = {1,3,5};
int arr2[] = {2,4,6};
q1 ob = new q1();
float res = ob.findMedian(arr1, arr2);
System.out.println(res);
}
}