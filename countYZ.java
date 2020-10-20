
/*Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it.
(Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
*/

public int countYZ(String str) {
int a =0;
str = str.toLowerCase();
 for(int i=0;i<str.length()-1;i++){
  if(str.charAt(i)=='y' && !Character.isLetter(str.charAt(i+1))){
      a++;
    }else if(str.charAt(i)=='z' && !Character.isLetter(str.charAt(i+1))){
      a++;
    }
            
        }
   if(str.charAt(str.length()-1)=='y'){
      a++;
    }else if(str.charAt(str.length()-1)=='z'){
      a++;
    }
        return a;
}
