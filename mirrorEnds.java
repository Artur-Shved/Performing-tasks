
/*Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string. In other words,
zero or more characters at the very begining of the given string, 
and at the very end of the string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".
*/

public String mirrorEnds(String string) {
  String s ="";
  int i=0;
  while(i<string.length()){
    if(string.charAt(i) == string.charAt(string.length()-1-i)){
      s+=string.charAt(i);
    }else{
      return s;
    }
    i++;
  }
  return s;
}
