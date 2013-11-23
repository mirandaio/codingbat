/* Look for patterns like "zip" and "zap" in the string -- length-3, starting 
 * with 'z' and ending with 'p'. Return a string where for all such words, 
 * the middle letter is gone, so "zipXzap" yields "zpXzp".
 */
public String zipZap(String str) {
    char[] arr = new char[str.length()];
    int count = 0;
      
    int i = 0;
    while(i < str.length()) {
        if(i < str.length() - 2 && str.charAt(i) == 'z' && 
            str.charAt(i + 2) == 'p') {
            arr[count] = 'z';
            count++;
            arr[count] = 'p';
            count++;
            i += 3;
        } else {
            arr[count] = str.charAt(i);
            count++;
            i++;
        }
    }
                                                                          
    return new String(arr, 0, count);  
}
