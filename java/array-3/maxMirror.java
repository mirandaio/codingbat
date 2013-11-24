/* We'll say that a "mirror" section in an array is a group of contiguous 
 * elements such that somewhere in the array, the same group appears in 
 * reverse order. For example, the largest mirror section in 
 * {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part). Return the size 
 * of the largest mirror section found in the given array.
 */
public int maxMirror(int[] nums) {
    int max = 0;
    
    for(int start = 0; start < nums.length; start++) {
        int begin = nums.length - 1;
              
        while(begin >= 0) {
            int finish = start + 1;
            while(begin >= 0 && nums[begin] != nums[start])
                begin--;
                                              
            int end = begin - 1;
                                                          
            while(finish < nums.length && end >= 0 && 
                nums[finish] == nums[end]) {
                finish++;
                end--;
            }
            
            max = Math.max(max, finish - start);
            
            begin--;
        }
    }
    
    return max;
}
