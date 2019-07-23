import java.util.*;
public class OddEven {
    public static void main(String[] args)
    {
        int[] nums = {5, 7, 2, 4, 9};
        int digit_even = 0, digit_odd = 0;
        System.out.println("Original Array: "+Arrays.toString(nums));

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0)
            {
                digit_even++;
            }
            else
                digit_odd++;
        }
        System.out.printf("\nNumber of even elements in the array: %d",digit_even);
        System.out.println("Number of odd elements in the array: %d",digit_odd);
        System.out.println("");
    }
}