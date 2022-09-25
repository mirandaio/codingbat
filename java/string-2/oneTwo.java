/*
 * Given a string, compute a new string by moving the first char to come after
 * the next two chars, so "abc" yields "bca". Repeat this process for each
 * subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any group of
 * fewer than 3 chars at the end.
 */
public String oneTwo(String str) {
  // creates a new string to append each reversed group of three to
  String newString = "";
  // for each whole group of three in the string
  for (int i = 0; i < str.length() / 3; i++) {
    // gets three letters by splitting the string starting at the index of the 
    // group of three times three (because there are three charachters per group)
    String threeLetters = str.substring(i * 3, i * 3 + 3);
    // appends the first of the three letters to the end
    threeLetters += threeLetters.charAt(0);
    // appends the last three charachters of our new string (the original last two
    // + the first original charachter) to the newstring
    newString += threeLetters.substring(1, 4);
  }
  // returns our new string (with the reversed three letter group) + the remaining un-
  // reversed charachters
  return newString + newString.substring(newString.length() - (newString.length() % 3));
}
