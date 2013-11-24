/* Given a string, return the sum of the digits 0-9 that appear in the 
 * string, ignoring all other characters. Return 0 if there are no digits in 
 * the string.
 */
public int sumDigits(String str) {
    int sum = 0;
    
    for(int i = 0; i < str.length(); i++) {
        if(Character.isDigit(str.charAt(i)))
            sum = sum + str.charAt(i) - '0';
    }
                    
    return sum;
}
