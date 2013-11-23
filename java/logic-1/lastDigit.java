/* Given three ints, a b c, return true if two or more of them have the same 
 * rightmost digit. The ints are non-negative.
 */
public boolean lastDigit(int a, int b, int c) {
    return (a % 10 == b % 10) || (a % 10 == c % 10) || (b % 10 == c % 10);
}
