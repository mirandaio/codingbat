/* Given three int values, a b c, return the largest.
 */
public int intMax(int a, int b, int c) {
    int largest = a;
    
    if(b > largest)
        largest = b;
              
    if(c > largest)
        largest = c;
                        
    return largest;
}
