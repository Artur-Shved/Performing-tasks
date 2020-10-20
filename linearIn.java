/*Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer.
The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.
*/

public boolean linearIn(int[] outer, int[] inner) {
 
 boolean b = false;
   int a =0;
   int c =0;
   if(inner.length<1){
     return true;
   }
    for(int i=0;i<outer.length;i++){
       
       if(outer[i] == inner[a]){
         b = true;
         if(a< inner.length-1){
         a++;
         }
       }
       
      if(a == inner.length-1 && b == true){
        while(c<outer.length){
          if(outer[c] == inner[a]){
            return true;
          }
          c++;
        }
      }
       

            


        }
        return false;
}

