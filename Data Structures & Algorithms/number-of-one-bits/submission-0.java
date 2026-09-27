class Solution {
    public int hammingWeight(int n) {
        int val =0 ;
        for(int i=1;i<=32;i++){

            int num = n & 1;
            val+=num;
            n>>=1;
        }
        return val;
    }
}
