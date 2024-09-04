
// Leetcode - Move zeroes to end

// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

package Leetcode_IMP.HashMaps;

import java.util.*;

public class leet_283 {
    public static void moveZeroes(int[] nums) {
        int zero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                nums[zero++] = nums[i];
        }
        while (zero < nums.length) {
            nums[zero++] = 0;
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] a = { 1, 2, 3, 0, 0, 5, 9, 7 };
        moveZeroes(a);

    }
}
