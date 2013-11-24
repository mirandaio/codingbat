/* Given a string, return the length of the largest "block" in the string. 
 * A block is a run of adjacent chars that are the same.
 */
public int maxBlock(String str) {
    if(str.length() == 0)
        return 0;
          
    int largest = 0;
    int current = 1;
                
    for(int i = 1; i < str.length(); i++) {
        if(str.charAt(i) != str.charAt(i-1)) {
            if(current > largest)
                largest = current;
            current = 1;
        } else {
            current++;
        }
    }
                                                            
    return Math.max(largest, current);
}
