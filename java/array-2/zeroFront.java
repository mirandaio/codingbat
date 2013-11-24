/* Return an array that contains the exact same numbers as the given array, 
 * but rearranged so that all the zeros are grouped at the start of the array. 
 * The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes 
 * {0 ,0, 1, 1}. You may modify and return the given array or make a new array.
 */
public int[] zeroFront(int[] nums) {
    if(nums.length == 0)
        return nums;
          
    int i = 0;
              
    while(nums[i] == 0)
        i++;
                        
    for(int j = i + 1; j < nums.length; j++) {
        if(nums[j] == 0) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
        }
    }
                                                              
    return nums;
}
