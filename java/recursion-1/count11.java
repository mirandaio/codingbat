/* Given a string, compute recursively (no loops) the number of "11" 
 * substrings in the string. The "11" substrings should not overlap.
 */
public int count11(String str) {
    if(str.length() <= 1)
        return 0;
          
    if(str.substring(0, 2).equals("11"))
        return 1 + count11(str.substring(2));
                    
    return count11(str.substring(1));
}
