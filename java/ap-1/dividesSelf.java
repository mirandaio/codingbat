/* We'll say that a positive int divides itself if every digit in the number 
 * divides into the number evenly. So for example 128 divides itself since 
 * 1, 2, and 8 all divide into 128 evenly. We'll say that 0 does not divide 
 * into anything evenly, so no number with a 0 digit divides itself.
 */
public boolean dividesSelf(int n) {

    for(int val = n; val != 0; val /= 10) {
        int digit = val % 10;
        if(digit == 0 || n % digit != 0)
            return false;
    }
                      
    return true;
}
