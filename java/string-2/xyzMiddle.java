/* Given a string, does "xyz" appear in the middle of the string? To define 
 * middle, we'll say that the number of chars to the left and right of the 
 * "xyz" must differ by at most one. This problem is harder than it looks.
 */
public boolean xyzMiddle(String str) {
    if(str.length() < 3)
        return false;
          
    int start1 = str.length() / 2 - 2;
    int start2 = str.length() / 2 - 1;
                  
    if(str.length() % 2 == 0) {
        return str.substring(start1, start1 + 3).equals("xyz") ||
            str.substring(start2, start2 + 3).equals("xyz");
    }
                                  
    return str.substring(start2, start2 + 3).equals("xyz");
}
