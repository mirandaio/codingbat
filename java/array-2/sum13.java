/* Return the sum of the numbers in the array, returning 0 for an empty 
 * array. Except the number 13 is very unlucky, so it does not count and 
 * numbers that come immediately after a 13 also do not count.
 */
public int sum13(int[] nums) {
    int sum = 0;
    int i = 0;
      
    while(i < nums.length) {
        if(nums[i] == 13) {
            i += 2;
        } else {
            sum += nums[i];
            i++;
        }
    }
                                          
    return sum;
}
