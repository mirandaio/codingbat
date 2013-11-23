/* Given 2 ints, a and b, return their sum. However, sums in the 
 * range 10..19 inclusive, are forbidden, so in that case just return 20.
 */
public int sortaSum(int a, int b) {
    int sum = a + b;
    
    if(10 <= sum && sum <= 19)
        return 20;
              
    return sum;
}
