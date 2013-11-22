/* Given three ints, a b c, one of them is small, one is medium and one is 
 * large. Return true if the three values are evenly spaced, so the 
 * difference between small and medium is the same as the difference between 
 * medium and large.
 */
public boolean evenlySpaced(int a, int b, int c) {
    int temp;
    if(a > b) {
        temp = a;
        a = b;
        b = temp;
    }
                    
    if(b > c) {
        temp = b;
        b = c;
        c = temp;
    }
                                      
    if(a > b) {
        temp = a;
        a = b;
        b = temp;
    }
                                                        
    return b - a == c - b;
}
