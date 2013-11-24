/* Given an array of strings, return the count of the number of strings with 
 * the given length.
 */
public int wordsCount(String[] words, int len) {
    int count = 0;
    
    for(int i = 0; i < words.length; i++) {
        if(words[i].length() == len)
            count++;
    }
                    
    return count;
}
