/* Given two int values, return their sum. Unless the two values are the same, 
 * then return double their sum.
 */
public int sumDouble(int a, int b) {
    int sum = a + b;
    if(a == b)
        return 2 * sum;
        
    return sum;
}
