class Solution {
    public int[] replaceElements(int[] arr) {
        
        int highiestValOnIndex = 0;
    

        for(int i = arr.length -1; i >= 0; i--)
        {
            int valueOnIndex = arr[i];
            arr[i] = highiestValOnIndex;

            if(valueOnIndex > highiestValOnIndex){
                highiestValOnIndex = valueOnIndex;
            }
            
        }
        arr[arr.length -1] = -1;
        return arr;

    }
}