/* Given two strings, A and B, create a bigger string made of the first char 
 * of A, the first char of B, the second char of A, the second char of B, 
 * and so on. Any leftover chars go at the end of the result.
 */
public String mixString(String a, String b) {
  StringBuffer mix = new StringBuffer();
  int len = (a.length() > b.length())? a.length(): b.length(); 
  for(int i = 0; i < len; i++){
    if(i < a.length()) mix.append(a.charAt(i)); 
    if(i < b.length()) mix.append(b.charAt(i)); 
  }
  return mix.toString(); 
}
