/* Given an array of ints, return true if the number of 1's is greater than 
 * the number of 4's
 */
public boolean more14(int[] nums) {
    int count1 = 0;
    int count4 = 0;
      
    for(int i = 0; i < nums.length; i++) {
        if(nums[i] == 1)
            count1++;
                        
        if(nums[i] == 4)
            count4++;
    }
                                      
    return count1 > count4;
}
