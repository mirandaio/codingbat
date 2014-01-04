/* We want to make a row of bricks that is goal inches long. We have a number 
 * of small bricks (1 inch each) and big bricks (5 inches each). Return true 
 * if it is possible to make the goal by choosing from the given bricks.
 */
public boolean makeBricks(int small, int big, int goal) {
    int remainder = goal >= (5 * big) ? goal - (5 * big) : goal % 5;
    
    return small >= remainder;
}
