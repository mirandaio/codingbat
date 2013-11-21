/* Given a string and a non-negative int n, return a larger string that is n 
 * copies of the original string.
 */
public String stringTimes(String str, int n) {
    char[] nCopy = new char[n * str.length()];
    int index = 0;
    
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < str.length(); j++) {
            nCopy[index] = str.charAt(j);
            index++;
        }
    }
                                
    return new String(nCopy);
}
