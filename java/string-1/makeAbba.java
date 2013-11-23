/* Given two strings, a and b, return the result of putting them together in 
 * the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
 */
public String makeAbba(String a, String b) {
    return a + b + b + a;
}
