/* Given 2 int values greater than 0, return whichever value is nearest to 21 
 * without going over. Return 0 if they both go over.
 */
public int blackjack(int a, int b) {
  if (a <= 21 && b > 21) {
    return a;
  }
  else if (a > 21 && b <= 21) {
    return b;
  }
  else if (a <= 21 && b <= 21) {
    if (a > b) {
      return a;
    }
    else {
      return b;
    }
  }
  else {
    return 0;
  }
}
