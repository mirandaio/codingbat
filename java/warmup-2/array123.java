/* Given an array of ints, return true if .. 1, 2, 3, .. appears in the array 
 * somewhere.
 */
public boolean array123(int[] nums) {
    for(int i = 0; i < nums.length - 2; i++) {
        if(nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3)
            return true;
    }
    
    return false;
}
