/* Given an array of ints, is it possible to divide the ints into two groups, 
 * so that the sum of the two groups is the same, with these constraints: all 
 * the values that are multiple of 5 must be in one group, and all the values 
 * that are a multiple of 3 (and not a multiple of 5) must be in the other. 
 * (No loops needed.)
 */
public boolean split53(int[] nums) {
    return split53Helper(0, nums, 0, 0);
}

public boolean split53Helper(int start, int[] nums, int mult5, int mult3) {
    if(start >= nums.length)
        return mult5 == mult3;
            
    if(nums[start] % 5 == 0)
        return split53Helper(start+1, nums, mult5 + nums[start], mult3);
                      
    if(nums[start] % 3 == 0)
        return split53Helper(start+1, nums, mult5, mult3 + nums[start]);
                                
    if(split53Helper(start+1, nums, mult5 + nums[start], mult3))
        return true;
                                          
    if(split53Helper(start+1, nums, mult5, mult3 + nums[start]))
        return true;
                                                    
    return false;
}
