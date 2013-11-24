/* Given an array of ints, return true if it contains no 1's or it contains 
 * no 4's.
 */
public boolean no14(int[] nums) {
    boolean has1 = false;
    boolean has4 = false;
    for(int i = 0; i < nums.length; i++) {
        if(nums[i] == 1)
            has1 = true;
                      
        if(nums[i] == 4)
            has4 = true;
    }
                                    
    return !has1 || !has4;
}
