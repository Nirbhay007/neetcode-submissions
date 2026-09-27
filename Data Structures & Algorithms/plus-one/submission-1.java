class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder s = new StringBuilder();

        for(int i : digits){
            s.append(Integer.toString(i) );
        }

        String str = String.valueOf(Long.parseLong(s.toString()) + 1);
    

        int res[] = new int[str.length()];
        for(int i=0;i<res.length;i++){
            res[i] = str.charAt(i)-'0';
        }
        return res;


    }
}
