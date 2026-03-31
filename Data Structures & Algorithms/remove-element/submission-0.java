class Solution 
{   public int removeElement(int[] nums, int val) 
    {
        int elementsLeft = 0;
            for(int i = 0; i < nums.length; i++)
            {
                int valueOnIndex = nums[i];
                if(valueOnIndex != val){
                  nums[elementsLeft] = valueOnIndex;
                  elementsLeft++;
                }
            } 
            return elementsLeft;      
    } 
}
