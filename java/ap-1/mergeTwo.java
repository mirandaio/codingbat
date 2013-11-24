/* Start with two arrays of strings, A and B, each with its elements in 
 * alphabetical order and without duplicates. Return a new array containing 
 * the first N elements from the two arrays. The result array should be in 
 * alphabetical order and without duplicates. A and B will both have a length 
 * which is N or more. The best "linear" solution makes a single pass over A 
 * and B, taking advantage of the fact that they are in alphabetical order, 
 * copying elements directly to the new array.
 */
public String[] mergeTwo(String[] a, String[] b, int n) {
    String[] arr = new String[n];
    int aIndex = 0;
    int bIndex = 0;
        
    for(int index = 0; index < n; index++) {
        if(a[aIndex].compareTo(b[bIndex]) < 0) {
            arr[index] = a[aIndex];
            aIndex++;
        } else if(a[aIndex].compareTo(b[bIndex]) > 0) {
            arr[index] = b[bIndex];
            bIndex++;
        } else {
            arr[index] = a[aIndex];
            aIndex++;
            bIndex++;
        }
    }
                                                                        
    return arr;
}
