package Tharani_Dharan.LeetCode;

import java.util.Arrays;

//leetocde 75
public class SortColors {
    public  static void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        while(mid<=high){
            if(nums[mid] == 0){
                //swap low and mid
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                mid++;
                low++;

            }
            else if(nums[mid] == 1){
                mid++;
            }

            else{
                //swap mid and high
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }

    }

    public static void main(String[] args) {
      int[] nums = {2,0,2,1,1,0};
      sortColors(nums);
      System.out.println("After in-place sort : "+Arrays.toString(nums));
    }
}
