
/*Given two strings, word and a separator sep, return a big string made of count occurrences of the word, 
separated by the separator string.
*/

public String repeatSeparator(String word, String sep, int count) {
  String s="";
  for(int i=0;i<count-1;i++){
    s+=word.concat(sep);
  }
  if(count>=1){
  return s.concat(word);
  }
  return s;
}
