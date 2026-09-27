class Solution {
    public boolean isAnagram(String s, String t) {
        // O(LogN) 
        // String sortedS = Stream.of(s.split("")).sorted().collect(Collectors.joining());
        // String sortedT = Stream.of(t.split("")).sorted().collect(Collectors.joining());

        // return sortedS.equals(sortedT);

        int freq[] = new int[27];

        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            freq[t.charAt(i)-'a']--;
        }

        for(int i=0;i<27;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;

    }
}
