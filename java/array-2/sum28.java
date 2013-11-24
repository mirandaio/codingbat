/* Given an array of ints, return true if the sum of all the 2's in the array 
 * is exactly 8.
 */
public boolean sum28(int[] nums) {
    int sum = 0;
    
    for(int i = 0; i < nums.length; i++) {
        if(nums[i] == 2)
            sum += nums[i];
    }
                    
    return sum == 8;
}
