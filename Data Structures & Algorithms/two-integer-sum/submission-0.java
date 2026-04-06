class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        //Brute force approach - O(n^2)
        // for(int i = 0 ; i < nums.length ; i++){
        //     for(int j = 0 ; j < nums.length ; j++){
        //         if(nums[i] + nums[j] == target && i != j ){
        //             int[] result = {i,j};
        //             Arrays.sort(result);
        //             return result;
        //         }

        //     }
        // }

        // return null ;

        HashMap<Integer, Integer> mapNums = new HashMap<Integer, Integer>();

        for(int i = 0 ; i < nums.length ; i++){
            int diff = target - nums[i] ;
            if(mapNums.get(diff) != null){
                int j = mapNums.get(diff);
                int[] result = {i , j};
                Arrays.sort(result);
                return result;
            }

            mapNums.put(nums[i],i);
        }

        return null;

    }
}
