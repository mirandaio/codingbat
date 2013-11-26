/* Given an array of ints, is it possible to choose a group of some of the 
 * ints, such that the group sums to the given target? This is a classic 
 * backtracking recursion problem. Rather than looking at the whole array, 
 * our convention is to consider the part of the array starting at index 
 * start and continuing to the end of the array. The caller can specify the 
 * whole array simply by passing start as 0. No loops are needed -- the 
 * recursive calls progress down the array.
 */
public boolean groupSum(int start, int[] nums, int target) {
    if(start >= nums.length)
        return target == 0;
          
    if(groupSum(start+1, nums, target - nums[start]))
        return true;
                    
    if(groupSum(start+1, nums, target))
        return true;
                              
    return false;
}
