/* Given a string, compute recursively a new string where all the lowercase 
 * 'x' chars have been moved to the end of the string.
 */
public String endX(String str) {
    if(str.length() <= 1)
        return str;
          
    if(str.charAt(0) == 'x')
        return endX(str.substring(1)) + 'x';
                    
    return str.charAt(0) + endX(str.substring(1));
}
