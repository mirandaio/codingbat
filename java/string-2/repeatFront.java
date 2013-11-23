/* Given a string and an int n, return a string made of the first n 
 * characters of the string, followed by the first n-1 characters of the 
 * string, and so on. You may assume that n is between 0 and the length of 
 * the string, inclusive (i.e. n >= 0 and n <= str.length()).
 */
public String repeatFront(String str, int n) {
    StringBuffer result = new StringBuffer();
    
    for(int i = n; i > 0; i--)
        result.append(str.substring(0, i));
            
    return result.toString();
}
