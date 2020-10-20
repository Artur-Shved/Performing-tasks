/*Return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros are grouped at the start of the array. 
The order of the non-zero numbers does not matter.
So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. You may modify and return the given array or make a new array.
*/

public int[] zeroFront(int[] nums) {

        int i = 0;
        int c =0;
        int d =0;
        while(c< nums.length){
            if(nums[c] == 0){
                i++;
            }
            c++;
        }

        

        for(int j=0 ; j<nums.length;j++){
            if(nums[j] !=0){
                d = nums[j];
            }else if (nums[nums.length-1]!=0){
                d = nums[nums.length-1];
            }
            if(j<i){
                nums[j] = 0;
            }else if (j>=i){
                nums[j] = d;
            }

        }
  
 
  return nums;
}
