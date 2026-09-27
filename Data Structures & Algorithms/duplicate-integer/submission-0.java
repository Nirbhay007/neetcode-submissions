class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        Set<Integer> st = new HashSet<>();
        for(int i: nums){
            st.add(i);
        }
        return nums.length != st.size();
    }
}
