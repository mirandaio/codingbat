/* Return a version of the given array where all the 10's have been removed. 
 * The remaining elements should shift left towards the start of the array as 
 * needed, and the empty spaces a the end of the array should be 0. So 
 * {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and return the given 
 * array or make a new array.
 */
public int[] withoutTen(int[] nums) {
    int i = 0;
    
    while(i < nums.length && nums[i] != 10)
        i++;
              
    for(int j = i + 1; j < nums.length; j++) {
        if(nums[j] != 10) {
            nums[i] = nums[j];
            nums[j] = 10;
            i++;
        }
    }
                                              
    for( ; i < nums.length; i++)
        nums[i] = 0;
                                                      
    return nums;
}
