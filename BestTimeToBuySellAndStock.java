package Arrays;

import java.util.Scanner;

public class BestTimeToBuySellAndStock {
    
     public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for(int i=0; i<prices.length; i++){
            for(int j=i+1; j<prices.length;j++){
                if(prices[j]>prices[i]){
                    int SP = prices[j]-prices[i];
                    if(SP > maxProfit){
                        maxProfit = SP;
                    }
                }
            }
        }
        
        return maxProfit;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] prices = {7, 1, 5, 3, 6, 4};
        BestTimeToBuySellAndStock obj = new BestTimeToBuySellAndStock();

        obj.maxProfit(prices);
    }

}
