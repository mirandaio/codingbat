/* Given a string, we'll say that the front is the first 3 chars of the 
 * string. If the string length is less than 3, the front is whatever is 
 * there. Return a new string which is 3 copies of the front.
 */
public String front3(String str) {
    String front;
    if(str.length() < 3)
        front = str;
    else
        front = str.substring(0, 3);
                   
    return front + front + front;
}
