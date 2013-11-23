/* Given two ints, each in the range 10..99, return true if there is a digit 
 * that appears in both numbers, such as the 2 in 12 and 23.
 */
public boolean shareDigit(int a, int b) {
    int al = a / 10;
    int ar = a % 10;
    int bl = b / 10;
    int br = b % 10;
          
    return al == bl || al == br || ar == bl || ar == br;
}
