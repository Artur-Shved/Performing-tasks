
/*Given a string, return the length of the largest "block" in the string. A block is a run of adjacent chars that are the same.
*/

public int maxBlock(String str) {
  int c = 0;
  int totalMax = 0;
  for(int i=0;i < str.length(); i++){
    c = 0;
    for(int j = i; j < str.length(); j++){
      if(str.charAt(i)!=str.charAt(j)){
        break;
      }
      if(str.charAt(i) == str.charAt(j)){
        c++;
      }
      totalMax = Math.max(totalMax,c);
      
    }
  }
  return totalMax;
}
