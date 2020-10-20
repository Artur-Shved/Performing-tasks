
/*Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n}(spaces added to show the grouping). 
Note that the length of the array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.
*/

public int[] seriesUp(int n) {
    
        int[] array = new int [n* (n + 1) /2];
        int l = n;
        int b = l+1;
        int a =0;
    
        for(int i=0;i<array.length;i++){

            if(a+n == i){
                a=i;
                l--;
                n--;
            }

            if(b == 1){
                b = l+1;
            }
            if (b > 1 ) {
                b--;
            }
   
    array[array.length-1-i] = b;
  }
  return array;
}
