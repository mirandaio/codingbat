/* We'll say that a String is xy-balanced if for all the 'x' chars in the 
 * string, there exists a 'y' char somewhere later in the string. So "xxy" is 
 * balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true 
 * if the given string is xy-balanced.
 */
public boolean xyBalance(String str) {
    boolean y = false;
    for(int i = str.length() - 1; i >= 0; i--) {
        if(str.charAt(i) == 'y')
            y = true;
                    
        if(str.charAt(i) == 'x' && !y)
            return false;
    }
                                  
    return true;
}
