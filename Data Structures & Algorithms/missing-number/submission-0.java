class Solution {
    public int missingNumber(int[] nums) {
        
        int sum = 0;
        int len = nums.length;

        for(int i : nums){
            sum+=i;
        }

        int total = (len*(len+1))/2;
        return total-sum;
    }
}
