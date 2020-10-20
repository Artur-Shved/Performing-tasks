/*Given two strings, a and b, create a bigger string made of the first char of a, 
the first char of b, the second char of a, the second char of b, 
and so on. Any leftover chars go at the end of the result.
*/

public String mixString(String a, String b) {
  String c="";
  int e = Math.min(a.length() , b.length());
  for(int i=0;i<e;i++){
    c+=a.substring(i ,i+1).concat(b.substring(i,i+1));
  }
  
  if(a.length()>b.length()){
    c=c.concat(a.substring(b.length()));
  }else if(b.length()>a.length()){
    c=c.concat(b.substring(a.length()));
  }
  return c;
}
