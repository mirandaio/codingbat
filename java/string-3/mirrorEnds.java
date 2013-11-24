/* Given a string, look for a mirror image (backwards) string at both the 
 * beginning and end of the given string. In other words, zero or more 
 * characters at the very begining of the given string, and at the very end 
 * of the string in reverse order (possibly overlapping). For example, the 
 * string "abXYZba" has the mirror end "ab".
 */
public String mirrorEnds(String string) {
    StringBuilder result = new StringBuilder();
    
    for(int i = 0; i < string.length(); i++) {
        if(string.charAt(i) == string.charAt(string.length() - i - 1))
            result.append(string.charAt(i));
        else
            break;
    }
                              
    return result.toString();
}
