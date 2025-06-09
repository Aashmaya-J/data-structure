package day2;
import java.util.Arrays;

public class postass2 {
    public static int[] findTwoSum(int[] nums, int target) {
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int currentSum = nums[left] + nums[right];
            
            if (currentSum == target) {
                return new int[] {nums[left], nums[right]};
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] nums = {4, 5, 2, 6, 9, 10};
        int target = 8;
        int[] result = findTwoSum(nums, target);
        if (result != null) {
            System.out.println("Pair found: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No pair found.");
        }
    }
}

