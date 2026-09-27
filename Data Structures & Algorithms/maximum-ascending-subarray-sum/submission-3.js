class Solution {
    /**
     * @param {number[]} nums
     * @return {number}
     */
    maxAscendingSum(nums) {

        let currMax = nums[0];
        let totalMax = currMax;
        for(let i=1;i<nums.length;i++){
            while(nums[i]>nums[i-1] && i<nums.length){
                currMax+=nums[i];
                totalMax = Math.max(currMax,totalMax);
                i++;
            }
            if(i>=nums.length){
                break;
            }
            currMax = nums[i];
            totalMax = Math.max(currMax,totalMax);

        }
        return totalMax;
    }
}
