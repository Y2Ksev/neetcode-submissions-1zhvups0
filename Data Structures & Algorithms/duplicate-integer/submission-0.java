class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        Arrays.sort(nums);
        int positionOnIndex = 0;
      

        for(int i = 1; i < nums.length; i++){
            int valOnIndex = nums[i];
           
            if(nums[positionOnIndex] == valOnIndex){
                return true;
            }
            positionOnIndex++;
        }
        return false;

    }
}