/* The web is built with HTML strings like "<i>Yay</i>" which draws Yay as 
 * italic text. In this example, the "i" tag makes <i> and </i> which surround 
 * the word "Yay". Given tag and word strings, create the HTML string with 
 * tags around the word, e.g. "<i>Yay</i>".
 */
public String makeTags(String tag, String word) {
    return "<" + tag + ">" + word + "</" + tag + ">";
}
