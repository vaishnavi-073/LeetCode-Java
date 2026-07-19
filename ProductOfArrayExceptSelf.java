package Arrays;

import java.util.*;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] productArr = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int product = 1;
            for(int j=0; j<nums.length; j++){
                if(i!=j){
                product *= nums[j];
                }
            }
            productArr[i] = product;
        }    
        return productArr;
    }

    public static void main(String[] args){

        int[] nums = {1, 2, 3, 4};
        ProductOfArrayExceptSelf obj = new ProductOfArrayExceptSelf();
        int[] ans = obj.productExceptSelf(nums);
        for(int x:ans){
            System.out.print(x+ " ");
        }
    }
}
