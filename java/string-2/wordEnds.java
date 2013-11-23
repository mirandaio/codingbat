/* Given a string and a non-empty word string, return a string made of each 
 * char just before and just after every appearance of the word in the 
 * string. Ignore cases where there is no char before or after the word, and 
 * a char may be included twice if it is between two words.
 */
public String wordEnds(String str, String word) {
    StringBuffer result = new StringBuffer();
    int i = 0;
      
    if(str.length() >= word.length() + 1 && 
        str.substring(0, word.length()).equals(word)) {
        i = word.length() - 1;
        result.append(str.charAt(i + 1));
    }
                        
    while(i < str.length() - word.length()) {
        if(str.substring(i + 1, i + 1 + word.length()).equals(word)) {
            result.append(str.charAt(i));
            i = i + word.length();
            if(i < str.length() - 1) {
                result.append(str.charAt(i + 1));
            }
        } else {
            i++;
        }
    }
                                                                                
    return result.toString();
}
