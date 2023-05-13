class Solution {
    public int repeatedNTimes(int[] nums) {
        int n=(int)(nums.length/2);
        Map<Integer, Integer> dict = new HashMap<Integer, Integer>();
        for (int j = 0; j <= nums.length; j++) {
            if(dict.containsKey(nums[j])){
                dict.put(nums[j],dict.get(nums[j])+1);
            }
            else{
                dict.put(nums[j],1);
            }
            if(dict.get(nums[j])==n){
                return nums[j];
            }
        }
        return 0;
    }
}