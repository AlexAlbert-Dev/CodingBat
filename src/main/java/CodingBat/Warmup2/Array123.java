package CodingBat.Warmup2;

import java.util.Arrays;

public class Array123 {
    /*
    Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
    array123([1, 1, 2, 3, 1]) → true
    array123([1, 1, 2, 4, 1]) → false
    array123([1, 1, 2, 1, 2, 3]) → true
     */
    public boolean array123(int[] nums) {
        int[] comparacao = new int[]{1,2,3};
        for(int i=0; i<nums.length; i++){
            if(i<nums.length-2 &&
                    Arrays.equals(Arrays.copyOfRange(nums, i, i+3), comparacao))
                return true;
        }
        return false;
    }
}
