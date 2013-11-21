/* Given 2 int values, return true if they are both in the range 30..40 
 * inclusive, or they are both in the range 40..50 inclusive.
 */
public boolean in3050(int a, int b) {
    boolean aRange1 = 30 <= a && a <= 40;
    boolean aRange2 = 40 <= a && a <= 50;
    boolean bRange1 = 30 <= b && b <= 40;
    boolean bRange2 = 40 <= b && b <= 50;
          
    return aRange1 && bRange1 || aRange2 && bRange2;
}
