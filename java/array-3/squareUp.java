/* Given n>=0, create an array length n*n with the following pattern, shown 
 * here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1}
 */
public int[] squareUp(int n) {
    int[] arr = new int[n*n];
    
    if(n == 0)
        return arr;
              
    for(int i = n - 1; i < arr.length; i += n) {
        for(int j = i; j >= i - i / n; j--)
            arr[j] = i - j + 1;
    }
                              
    return arr;
}
