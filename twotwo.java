/*Given an array of ints, return true if every 2 that appears in the array is next to another 2.
*/

public boolean twoTwo(int[] nums) {
  boolean b = true;
  
  for(int i=0;i<nums.length-1;i++){
    
    if(b==false && nums[i]==2 && nums[i+1]==2){
      b =  true;
    }else if(nums[i]!=2 && nums[i+1]==2){
      b = false;
    }
  }
  
  if(nums.length<1){
    return true;
  }else if(nums.length<=1 && nums[0]==2){
    return false;
  }
  return b;
}

