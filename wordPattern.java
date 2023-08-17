class Solution {
    public boolean wordPattern(String pattern, String s) {
        String [] words = s.split(" ");
        if(words.length != pattern.length()) return false;
        HashMap<Character, String> hm = new HashMap<>();
        for(int i = 0; i < pattern.length(); i++) {
            char key = pattern.charAt(i);
            String value = words[i];
            if(hm.containsKey(key) && !hm.get(key).equals(value)) {
                return false;
            }else if(hm.containsValue(value) && ! hm.containsKey(key)) {
                return false;
            }else{
                hm.put(key, value);
            }
        }
        return true;
    }
}
