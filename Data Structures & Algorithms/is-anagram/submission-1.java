class Solution {

    public Map<Character, Integer> buildFreqMap(String s){
            Map<Character, Integer> freq = new HashMap<>();
            for(int i =0 ; i < s.length(); i++){
                char c = s.charAt(i);
                freq.put(c, freq.getOrDefault(c, 0) +1);
            }

            return freq;
    }

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> freqMapS = buildFreqMap(s);
        Map<Character, Integer> freqMapT = buildFreqMap(t);
        
        return freqMapS.equals(freqMapT);

    }
}
