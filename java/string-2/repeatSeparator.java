/* Given two strings, word and a separator, return a big string made of count 
 * occurences of the word, separated by the separator string.
 */
public String repeatSeparator(String word, String sep, int count) {
    if(count == 0)
        return "";
          
    StringBuffer result = new StringBuffer();
              
    for(int i = 0; i < count - 1; i++) {
        result.append(word);
        result.append(sep);
    }
                            
    return result.append(word).toString();
}
