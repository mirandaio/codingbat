/* Given an array of ints, return true if the value 3 appears in the array 
 * exactly 3 times, and no 3's are next to each other.
 */
public boolean haveThree(int[] nums) {
    int count = 0;
    
    if(nums.length >= 1 && nums[0] == 3)
        count++;

    for(int i = 1; i < nums.length; i++) {
        if(nums[i - 1] == 3 && nums[i] == 3)
            return false;
                            
        if(nums[i] == 3)
            count++;
    }
                                          
    return count == 3;
}
