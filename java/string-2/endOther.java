/* Given two strings, return true if either of the strings appears at the 
 * very end of the other string, ignoring upper/lower case differences (in 
 * other words, the computation should not be "case sensitive").
 */
public boolean endOther(String a, String b) {
    if(a.length() < b.length()) {
        String temp = a;
        a = b.toLowerCase();
        b = temp.toLowerCase();
    }
                  
    return a.substring(a.length() - b.length()).equals(b);
}
