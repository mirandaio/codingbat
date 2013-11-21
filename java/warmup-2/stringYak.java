/* Suppose the string "yak" is unlucky. Given a string, return a version where 
 * all the "yak" are removed, but the "a" can be any char. The "yak" strings 
 * will not overlap.
 */
public String stringYak(String str) {
    char[] result = new char[str.length()];
    int count = 0;

    for(int i = 0; i < str.length();) {
        if(i < str.length() - 2 && str.charAt(i) == 'y' && 
            str.charAt(i + 2) == 'k') {
            i += 3;
        } else {
            result[count] = str.charAt(i);
            count++;
            i++;
        }
    } 
                                                     
    return new String(result, 0, count);
}
