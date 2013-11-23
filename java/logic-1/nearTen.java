/* Given a non-negative number "num", return true if num is within 2 of a 
 * multiple of 10.
 */
public boolean nearTen(int num) {
    return num % 10 <= 2 || num % 10 >= 8;
}
