/* You are driving a little too fast, and a police officer stops you. Write 
 * code to compute the result, encoded as an int value: 0=no ticket, 1=small 
 * ticket, 2=big ticket. If speed is 60 or less, the result is 0. If speed is 
 * between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the 
 * result is 2. Unless it is your birthday -- on that day, your speed can be 
 * 5 higher in all cases.
 */
public int caughtSpeeding(int speed, boolean isBirthday) {
    if(isBirthday) {
        if(speed <= 65) {
            return 0;
        } else if(66 <= speed && speed <= 85) {
            return 1;
        } else if(86 <=  speed) {
            return 2;
        }
    }
                                        
    if(speed <= 60) {
        return 0;
    } else if(61 <= speed && speed <= 80) {
        return 1;
    } else {
        return 2;
    }
}
