/*Given a non-empty array, return true if there is a place to split the array so
that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
*/

public boolean canBalance(int[] nums) {
int max1 = 0;
int max2 = 0;
      for(int i=0;i<nums.length;i++){
        max1 += nums[i];
            for(int j = nums.length-1; j >= 0; j--){
              
                    max2 += nums[j];
      
                if(max2 > max1){
                    max2 = 0;
                    break;
                }
                
                
                if(max2 == max1 && i==j-1){
                   return true;
                }else{
                  continue;
                }
            }
            
}
return false;
  
}
