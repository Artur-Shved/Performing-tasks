
/*Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, 
they are the same.
*/

public boolean sameStarChar(String str) {
boolean b = true;

  for(int i = 0; i < str.length(); i++){
      if(i >=1) {
          int a = str.indexOf("*", i);
            if(a != -1 && a < str.length()-1){
              if(str.charAt(a-1) != str.charAt(a+1)){
                b = false;
              }else{
                b = true;
              }
            }
      }
  }
    return b;
  
  
}

