/* A sandwich is two pieces of bread with something in between. Return the 
 * string that is between the first and last appearance of "bread" in the 
 * given string, or return the empty string "" if there are not two pieces 
 * of bread.
 */
public String getSandwich(String str) {
    int first = -1;
    int last = -1;
      
    for(int i = 0; i < str.length() - 5; i++) {
        if(str.substring(i, i + 5).equals("bread")) {
            first = i;
            break;
        }
    }
                                
    for(int i = str.length() - 5; i >= 0; i--) {
        if(str.substring(i, i + 5).equals("bread")) {
            last = i;
            break;
        }
    }
                                                          
    if(first != -1 && last != -1 && first != last)
        return str.substring(first + 5, last);
                                                                    
    return "";
}
