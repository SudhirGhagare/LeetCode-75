class Solution {
    public int pivotIndex(int[] nums) {
        
        int left = 0;
        int right = 0;
        
        for(int i = 1; i < nums.length ; i++){
            right += nums[i];
        }

        if(left == right){
            return 0;
        }
        
        for(int i = 1; i < nums.length ; i++){
            
            left += nums[i-1];
            right -= nums[i];
            
            if(left == right){
                return i;
            }
        }
        
        
            return -1;
        
    }
}
