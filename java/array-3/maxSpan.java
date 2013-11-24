/* Consider the leftmost and righmost appearances of some value in an array. 
 * We'll say that the "span" is the number of elements between the two 
 * inclusive. A single value has a span of 1. Returns the largest span found 
 * in the given array. (Efficiency is not a priority.)
 */
public int maxSpan(int[] nums) {
    int max = 0;
    
    for(int i = 0; i < nums.length; i++) {
        int j = nums.length - 1;
              
        while(nums[i] != nums[j])
            j--;
                              
        int span = j - i + 1;
                                      
        if(span > max)
            max = span;
    }
                                                    
    return max;
}
