/* We want to make a row of bricks that is goal inches long. We have a number 
 * of small bricks (1 inch each) and big bricks (5 inches each). Return true 
 * if it is possible to make the goal by choosing from the given bricks.
 */
public int loneSum(int a, int b, int c) {
  if (a == b && b == c && a == c) {
    return 0;
  }
  else if (a == b) {
    return c;
  }
  else if (b == c) {
    return a;
  }
  else if (a == c) {
    return b;
  }
  else {
    return a + b + c;
  }
}
