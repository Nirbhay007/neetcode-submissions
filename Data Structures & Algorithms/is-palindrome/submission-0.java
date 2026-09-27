class Solution {
    public boolean isPalindrome(String s) {
        
       String s2 = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
       System.out.println(s2);
       String reversed = new StringBuilder(s2).reverse().toString();
       return reversed.equals(s2);
    }
}
