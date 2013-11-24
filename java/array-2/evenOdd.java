/* Return an array that contains the exact same numbers as the given array, 
 * but rearranged so that all the even numbers come before all the odd 
 * numbers. Other than that, the numbers can be in any order. You may modify 
 * and return the given array, or make a new array.
 */
public int[] evenOdd(int[] nums) {
    int i = 0;
    
    while(i < nums.length && nums[i] % 2 == 0)
        i++;
              
    for(int j = i + 1; j < nums.length; j++) {
        if(nums[j] % 2 == 0) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
        }
    }
                                                    
    return nums;
}
