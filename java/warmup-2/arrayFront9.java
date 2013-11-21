/* Given an array of ints, return true if one of the first 4 elements in the 
 * array is a 9. The array length may be less than 4.
 */
public boolean arrayFront9(int[] nums) {
    int i = 0;
    
    while(i < nums.length && i < 4) {
        if(nums[i] == 9)
            return true;
                      
        i++;
    }
                              
    return false;
}
