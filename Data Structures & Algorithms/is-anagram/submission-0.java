class Solution {
    public boolean isAnagram(String s, String t) {

        String sortedS = Stream.of(s.split("")).sorted().collect(Collectors.joining());
        String sortedT = Stream.of(t.split("")).sorted().collect(Collectors.joining());

        return sortedS.equals(sortedT);
    }
}
