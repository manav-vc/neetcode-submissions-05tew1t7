class Solution {
    public int search(int[] nums, int target) {

        return binarySearch(nums, target, 0, nums.length - 1);
        
    }

    public int binarySearch(int[] nums, int target, int startIndex, int endIndex){
        
        if (startIndex > endIndex) return -1;

        int middleIndex = startIndex + (endIndex - startIndex) / 2;
        

        if(nums[middleIndex] == target){
            return middleIndex;
        }
        else if(target > nums[middleIndex]){

            return binarySearch(nums, target, middleIndex + 1, endIndex );
        }
        else{
            return binarySearch(nums, target, startIndex , middleIndex - 1);
        }
        
        
    }
}

