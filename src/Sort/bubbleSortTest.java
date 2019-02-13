package Sort;

public class bubbleSortTest {

    public int[] bubble(int[] nums){
        int temp = 0;
        for(int i = 0; i< nums.length-1; i++)
            for(int j = 0; j < nums.length -i-1 ; j++)
                if (nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }

        return nums;

    }
    public static void main(String[] args){
        int[] nums = {5, 24, 45, 66, 8, 3, 88, 70};
        int[] sortTest = new bubbleSortTest().bubble(nums);
        for(int i = 0 ; i< nums.length; i++){
            System.out.println(sortTest[i]);
        }

    }

}
