class Solution {
    public int search(int[] nums, int target) {

        return binarySearch(nums, target);
        
    }

    public int binarySearch(int[] nums, int target){
        
        if (nums.length == 0) return -1;

        int middleIndex = nums.length / 2;
        

        if(nums[middleIndex] == target){
            return middleIndex;
        }
        else if(target > nums[middleIndex]){

            int result = binarySearch(Arrays.copyOfRange(nums, middleIndex + 1, nums.length), target);
            return (result == -1) ? -1 : middleIndex + 1 + result;
        }
        else{
            return binarySearch(Arrays.copyOfRange(nums,0,middleIndex), target);
        }
        
        
    }
}

