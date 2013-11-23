/* Given an array of ints of odd length, look at the first, last, and middle 
 * values in the array and return the largest. The array length will be a 
 * least 1.
 */
public int maxTriple(int[] nums) {
    int max = nums[0];
    
    if(max < nums[nums.length / 2])
        max = nums[nums.length / 2];
              
    if(max < nums[nums.length - 1])
        max = nums[nums.length - 1];
                        
    return max;
}
