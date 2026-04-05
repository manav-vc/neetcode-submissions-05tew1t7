class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Arrays.sort(nums);
        // for(int i = 0 ; i < nums.length - 1 ; i++){
        //     if(nums[i] == nums[i+1]){
        //         return true; 
        //     }
        // }
        // return false; 

        HashSet<Integer> num2 = new HashSet<Integer>();
        for(int i = 0 ; i <= nums.length - 1 ; i++){
            if(num2.contains(nums[i])){
                return true;
            }
            num2.add(nums[i]);
        }
        return false;
    }
}
