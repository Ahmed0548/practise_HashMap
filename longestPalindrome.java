class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int palindrome = 0;
        for(char c : s.toCharArray()) {
            if(set.contains(c)) {
                palindrome += 2;
                set.remove(c);
            }else{
                set.add(c);
            }
        }
        return set.size() > 0 ? palindrome + 1 : palindrome;
    }
}
