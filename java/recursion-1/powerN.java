/* Given base and n that are both 1 or more, compute recursively (no loops) 
 * the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
 */
public int powerN(int base, int n) {
    if(n <= 1)
        return base;
          
    return base * powerN(base, n - 1);
}
