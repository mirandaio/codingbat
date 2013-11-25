/* Start with two arrays of strings, a and b, each in alphabetical order, 
 * possibly with duplicates. Return the count of the number of strings which 
 * appear in both arrays. The best "linear" solution makes a single pass over 
 * both arrays, taking advantage of the fact that they are in alphabetical 
 * order.
 */
public int commonTwo(String[] a, String[] b) {
    int count = 0;
    int aIndex = 0;
    int bIndex = 0;
        
    if(a[0].equals(b[0])) {
        count++;
        aIndex++;
        bIndex++;
    } else if(a[0].compareTo(b[0]) < 0) {
        aIndex++;
    } else {
        bIndex++;
    }
                                      
    while(aIndex < a.length && bIndex < b.length) {
        if(aIndex > 0 && a[aIndex-1].equals(a[aIndex])) {
            aIndex++;
        } else if(a[aIndex].equals(b[bIndex])) {
            count++;
            aIndex++;
            bIndex++;
        } else if(a[aIndex].compareTo(b[bIndex]) < 0) {
            aIndex++;
        } else {
            bIndex++;
        }
    }
    
    return count;
}
