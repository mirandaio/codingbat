/* We want make a package of goal kilos of chocolate. We have small bars 
 * (1 kilo each) and big bars (5 kilos each). Return the number of small bars 
 * to use, assuming we always use big bars before small bars. Return -1 if it 
 * can't be done.
 */
public int makeChocolate(int small, int big, int goal) {
    int remainder = goal >= 5 * big ? goal - (5 * big) : goal % 5;
    
    return remainder <= small ? remainder : -1;
}
