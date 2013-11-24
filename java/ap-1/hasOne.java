/* Given a positive int n, return true if it contains a 1 digit.
 */
public boolean hasOne(int n) {
    while(n != 0) {
        if(n % 10 == 1)
            return true;
                  
        n /= 10;
    }
                          
    return false;
}
