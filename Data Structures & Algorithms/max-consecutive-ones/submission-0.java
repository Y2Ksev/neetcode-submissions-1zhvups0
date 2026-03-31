class Solution {
    public int findMaxConsecutiveOnes(int[] nums ) {
        
    int currentCount = 0;
    int maxCount = 0;

    for(int i = 0; i < nums.length; i++)
    {
       int index = nums[i];
       if(index == 1)
       {
            currentCount++;
            if(currentCount > maxCount)
            {
                maxCount = currentCount;
            }     
       }
       else if(index == 0)
       {
            currentCount = 0;
       }
    }    
    return maxCount;
    }
}