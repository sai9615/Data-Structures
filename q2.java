import java.lang.reflect.Array;
import java.util.*;

public class q2 {
    public int knapsack(int [] weight, int [] profit, int maxW, int items){
    int [][] knap = new int[items+1][maxW+1];    
        for(int i=0; i<=items; i++){
            for(int j=0; j<=maxW; j++){
                if(i==0 || j ==0){
                    knap[i][j] = 0;
                } else if (weight[i] <= j ){
                    knap[i][j] = max(profit[i]+knap[i-1][j - weight[i]], knap[i-1][j]);
                } else {
                    knap[i][j] = knap[i-1][j];
                }
            }
        }
        return knap[items][maxW];
    }

    public int max(int a, int b){
        if(a > b ) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        int [] weight = {0,2,3,4,5};
        int [] profit = {0,1,2,5,6};
        int maxW = 8;
        int items = 4;
        q2 ob = new q2();
        System.out.println("max profit is "+ ob.knapsack(weight, profit, maxW, items)); 
    }
}