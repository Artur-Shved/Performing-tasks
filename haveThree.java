
/*Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.
*/

public boolean haveThree(int[] nums) {
  int a =0;
  boolean b = false;
  for(int i=0;i<nums.length-2;i++){
    if(nums[i]==3 && nums[i+1]==3){
      
      continue;
    }else if(nums[i]==3 && nums[i+2]==3){
      a++;
    }
   
  }
  if(a==2){
    return true;
  }else{
    return false;
  }
  
}
