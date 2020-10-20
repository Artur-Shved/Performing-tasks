
/*Given a string, compute a new string by moving the first char to come after the next two chars, so "abc" yields "bca". 
Repeat this process for each subsequent group of 3 chars,
so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.
*/

public String oneTwo(String str) {
  String s = "";
  for(int i=1;i<str.length()-1;i+=3){
    s+=str.substring(i,i+2).concat(str.substring(i-1,i));
  }
  return s;
}
