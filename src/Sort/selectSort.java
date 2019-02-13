package Sort;

import java.util.Arrays;

public class selectSort {

    public int[] select(int[] nums){
        for(int i = 0; i < nums.length-1; i++){
            int k = i;
            for(int j = i+1; j < nums.length ; j++){
                if (nums[j] < nums[k]){
                    k = j;
                }

            }
            if (k > i){
                int temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
            }
        }
        return nums;

    }
    public static void main(String[] args){
        int[] nums = {5, 24, 45, 66, 8, 3, 88, 70};
        int[] sortTest = new selectSort().select(nums);
        for(int i = 0 ; i< nums.length; i++){
            System.out.println(sortTest[i]);
        }


    }
}
