/* Given a string, return a new string made of 3 copies of the first 2 chars 
 * of the original string. The string may be any length. If there are fewer 
 * than 2 chars, use whatever is there.
 */
public String extraFront(String str) {
    if(str.length() >= 2)
        str = str.substring(0, 2);
          
    return str + str + str;
}
