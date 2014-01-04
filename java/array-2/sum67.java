/* Return the sum of the numbers in the array, except ignore sections of 
 * numbers starting with a 6 and extending to the next 7 (every 6 will be 
 * followed by at least one 7). Return 0 for no numbers.
 */
public int sum67(int[] nums) {
    int sum = 0;
    boolean inRange = false;
      
    for(int i = 0; i < nums.length; i++) {
        if(nums[i] == 6)
            inRange = true;

        if(!inRange)
            sum += nums[i];
                                        
        if(inRange && nums[i] == 7)
            inRange = false;
                                                        
    }
                                                            
    return sum;
}
