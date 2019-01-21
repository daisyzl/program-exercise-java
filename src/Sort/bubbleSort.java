package Sort;

import java.util.Arrays;

public class bubbleSort {

    public  int[] bubble(int[] nums){
        int size = nums.length;

        int temp = 0;

        for (int i=0; i<size-1; i++)
            for (int j=0; j<size-i-1; j++){
                if (nums[j]>nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }



        return nums;


    }

    public static void main(String[] args) {
        int[] numbers = {5, 24, 45, 66, 8, 3, 88, 70};
        int size = numbers.length;
        int[] num=new bubbleSort().bubble(numbers);
        System.out.println(Arrays.toString(num));
        for(int i=0; i<size; i++){
            System.out.println(num[i]);
        }
    }

}
