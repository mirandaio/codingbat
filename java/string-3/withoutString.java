/* Given two strings, base and remove, return a version of the base string 
 * where all instances of the remove string have been removed (not case 
 * sensitive). You may assume that the remove string is length 1 or more. 
 * Remove only non-overlapping instances, so with "xxx" removing "xx" 
 * leaves "x".
 */
public String withoutString(String base, String remove) {
    char[] arr = new char[base.length()];
    int count = 0;
    int i = 0;
        
    while(i <= base.length() - remove.length()) {
        if(base.substring(i, i + remove.length()).toLowerCase().equals(
            remove.toLowerCase())) {
            i += remove.length();
        } else {
            arr[count] = base.charAt(i);
            count++;
            i++;
        }
    }
                                                        
    while(i < base.length()) {
        arr[count] = base.charAt(i);
        count++;
        i++;
    }
                                                                          
    return new String(arr, 0, count);
}
