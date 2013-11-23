/* Given two strings, A and B, create a bigger string made of the first char 
 * of A, the first char of B, the second char of A, the second char of B, 
 * and so on. Any leftover chars go at the end of the result.
 */
public String mixString(String a, String b) {
    char[] arr;
    String end;
    int count = 0;
        
    if(a.length() < b.length()) {
        arr = new char[2 * a.length()];
        end = b.substring(a.length());
    } else {
        arr = new char[2 * b.length()];
        end = a.substring(b.length());
    }
                                
    for(int i = 0; i < arr.length / 2; i++) {
        arr[count] = a.charAt(i);
        count++;
        arr[count] = b.charAt(i);
        count++;
    }
                                                      
    return new String(arr) + end;
}
