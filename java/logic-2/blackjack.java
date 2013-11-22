/* Given 2 int values greater than 0, return whichever value is nearest to 21 
 * without going over. Return 0 if they both go over.
 */
public int blackjack(int a, int b) {
    if(a > 21 && b > 21)
        return 0;
          
    if(a > 21)
        return b;
                    
    if(b > 21)
        return a;
                              
    return a > b ? a : b;
}
