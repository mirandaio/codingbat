/* Given a string, return a string where every appearance of the lowercase 
 * word "is" has been replaced with "is not". The word "is" should not be 
 * immediately preceeded or followed by a letter -- so for example the "is" 
 * in "this" does not count.
 */
public String notReplace(String str) {
    if(str.equals("is"))
        return "is not";
          
    StringBuilder result = new StringBuilder();
    int i = 0;
                  
    if(str.length() >= 3 && str.substring(0,2).equals("is") &&
        !Character.isLetter(str.charAt(2))) {
        result.append("is not");
        i = 2;
    }
                                    
    while(i < str.length()) {
        if(!Character.isLetter(str.charAt(i))) {
            result.append(str.charAt(i));
            i++;
        } else if(i >= 1 && i <= str.length()-3 && 
            !Character.isLetter(str.charAt(i-1)) &&
            str.substring(i,i+2).equals("is") &&
            !Character.isLetter(str.charAt(i+2))) {
            result.append("is not");
            i += 2;
        } else if(i >= 1 && !Character.isLetter(str.charAt(i-1)) &&
            str.substring(i).equals("is")) {
            result.append("is not");
            i += 2;
        } else {
            result.append(str.charAt(i));
            i++;
        }
    }
 
    return result.toString();
}
