
/*We'll say that a String is xy-balanced if for all the 'x' chars in the string,
*there exists a 'y' char somewhere later in the string. So "xxy" is balanced,
but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.
*/

public boolean xyBalance(String str) {
boolean b = true;

int x = str.lastIndexOf("x");
int y = str.lastIndexOf("y");
if(x < y){
  return true;
}else if(x == y){
  return true;
}else{
  return false;
}
}
