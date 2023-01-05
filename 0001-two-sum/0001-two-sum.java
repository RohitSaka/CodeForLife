class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int firstIndex = 0;
        int secondIndex = 0;
        
        int[] result = new int[2];
        
        for(int i = 0; i < nums.length ; i++){
            
            if(i != nums.length- 1){
            
            for(int j = i + 1; j < nums.length ; j++){
                
                
                if((nums[i] + nums[j]) == target){
                    
                    firstIndex = i;
                    secondIndex = j;
                    
                }
            }
            }
        }
        
        result[0] = firstIndex;
        result[1] = secondIndex;
        
        return result;
        
    }
}