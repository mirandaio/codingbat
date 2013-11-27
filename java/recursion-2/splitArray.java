/* Given an array of ints, is it possible to divide the ints into two groups, 
 * so that the sums of the two groups are the same. Every int must be in one 
 * group or the other. Write a recursive helper method that takes whatever 
 * arguments you like, and make the initial call to your recursive helper 
 * from splitArray(). (No loops needed.)
 */
public boolean splitArray(int[] nums) {
    return splitArrayHelper(0, nums, 0, 0);
}

public boolean splitArrayHelper(int start, int[] nums, int group1, 
    int group2) {
    if(start >= nums.length)
        return group1 == group2;
            
    if(splitArrayHelper(start+1, nums, group1 + nums[start], group2))
        return true;
                      
    if(splitArrayHelper(start+1, nums, group1, group2 + nums[start]))
        return true;
                                
    return false;
}
