
/*Given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string. 
Ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words.
*/

public String wordEnds(String str, String word) {
  
  String s = "";
 
  int wordLength =  word.length();
  if(str.equals(word)){
   return "";
 }
  for(int i=0; i>=(-1); i++){
    int a = str.indexOf(word, i);
    if(a== (-1)){
      break;
    }else if(a==0){
       s+=str.charAt(a+wordLength);
     }else if(a==str.length()-wordLength){
       s+=str.charAt(a-1);
     }else{
       s+="" + str.charAt(a-1) +  "" + str.charAt(a+wordLength);
     }
     
     i=a;
    
  }
  return s;
}
