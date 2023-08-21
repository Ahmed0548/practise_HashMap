class Solution {
    public int firstUniqChar(String s) {
       HashMap<Character, Integer> unique = new HashMap<>();
       for(char c : s.toCharArray()) {
           unique.put(c, unique.getOrDefault(c, 0) + 1);
        }
        for(int i = 0; i < s.length(); i++) {
            if(unique.containsKey(s.charAt(i)) && unique.get(s.charAt(i)) ==1) {
                return i;
            }
        }
        return -1; 
    }
}
