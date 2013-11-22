/* We want to make a row of bricks that is goal inches long. We have a number 
 * of small bricks (1 inch each) and big bricks (5 inches each). Return true 
 * if it is possible to make the goal by choosing from the given bricks.
 */
public boolean makeBricks(int small, int big, int goal) {
    int count = 5 * big > goal ? goal - (goal % 5) : 5 * big;
      
    return (goal - count) <= small;
}
