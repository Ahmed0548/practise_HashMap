class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> itsIso = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            if(itsIso.containsKey(s.charAt(i))) {
                if(!itsIso.get(s.charAt(i)).equals(t.charAt(i))) {
                    return false;
                }
            }else if(itsIso.containsValue(t.charAt(i))) {
                return false;
            }else{
                itsIso.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
}
