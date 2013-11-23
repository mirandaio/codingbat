/* Given two strings, append them together (known as "concatenation") and 
 * return the result. However, if the strings are different lengths, omit 
 * chars from the longer string so it is the same length as the shorter 
 * string. So "Hello" and "Hi" yield "loHi". The strings may be any length.
 */
public String minCat(String a, String b) {
    int min = Math.min(a.length(), b.length());
    
    return a.substring(a.length() - min) + b.substring(b.length() - min);
}
