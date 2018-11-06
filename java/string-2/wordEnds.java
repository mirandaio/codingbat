/* Given a string and a non-empty word string, return a string made of each 
 * char just before and just after every appearance of the word in the 
 * string. Ignore cases where there is no char before or after the word, and 
 * a char may be included twice if it is between two words.
 */
public String wordEnds(String str, String word) {
    int sl = str.length();
    int wl = word.length();
    String newstr = "";

for (int i=0; i<=sl-wl; i++) 
{ 
  if (i>0 && str.substring(i,i+wl).equals(word))
    newstr = newstr+str.charAt(i-1);
    
  if (i < sl-wl && str.substring(i,i+wl).equals(word))
    newstr += str.charAt(i+wl);
}
return newstr;
}
