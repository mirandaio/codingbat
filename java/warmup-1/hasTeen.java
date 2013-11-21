/* We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
 * Given 3 int values, return true if 1 or more of them are teen.
 */
public boolean hasTeen(int a, int b, int c) {
    return 13 <= a && a <= 19 ||
        13 <= b && b <= 19 ||
        13 <= c && c <= 19;
}
