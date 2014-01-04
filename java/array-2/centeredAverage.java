/* Return the "centered" average of an array of ints, which we'll say is the 
 * mean average of the values, except ignoring the largest and smallest 
 * values in the array. If there are multiple copies of the smallest value, 
 * ignore just one copy, and likewise for the largest value. Use int division 
 * to produce the final average. You may assume that the array is length 3 
 * or more.
 */
public int centeredAverage(int[] nums) {
    int sum = 0;
    int min = nums[0];
    int max = nums[0];
         
    for(int i = 0; i < nums.length; i++) {
        sum += nums[i];
        min = Math.min(min, nums[i]);
        max = Math.max(max, nums[i]);
    }
                           
    return (sum - min - max) / (nums.length - 2);
}
