/* Say that a "clump" in an array is a series of 2 or more adjacent elements 
 * of the same value. Return the number of clumps in the given array.
 */
public int countClumps(int[] nums) {
    int count = 0;
    int i = 0;
      
    while(i < nums.length) {
        int val = nums[i];
        i++;
        int length = 1;
        while(i < nums.length && nums[i] == val) {
            i++;
            length++;
        }
                                            
        if(length > 1)
            count++;
    }
                                                          
    return count;
}
