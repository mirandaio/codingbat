/* Given a non-negative int n, return the sum of its digits recursively 
 * (no loops).
 */
public int sumDigits(int n) {
    if(n == 0)
        return 0;
          
    return n % 10 + sumDigits(n / 10);
}
