/* Given an array of ints, return the sum of the first 2 elements in the 
 * array. If the array length is less than 2, just sum up the elements that 
 * exist, returning 0 if the array is length 0.
 */
public int sum2(int[] nums) {
    if(nums.length == 0)
        return 0;
          
    if(nums.length == 1)
        return nums[0];
                    
    return nums[0] + nums[1];
}
