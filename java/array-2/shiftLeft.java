/* Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns 
 * {2, 5, 3, 6}. You may modify and return the given array, or return a new 
 * array.
 */
public int[] shiftLeft(int[] nums) {
    if(nums.length < 1)
        return nums;
          
    int first = nums[0];
              
    for(int i = 1; i < nums.length; i++)
        nums[i - 1] = nums[i];
                        
    nums[nums.length - 1] = first;
                            
    return nums;
}
