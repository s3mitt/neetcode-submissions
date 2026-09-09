class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freqArr = new  int[26];
        if (s.length() != t.length()) return false;

        for (char c : s.toCharArray()) {
            freqArr[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            freqArr[c - 'a']--;
        }

        for (int num : freqArr) {
            if (num != 0) return false;
        }

        return true;
    }
}
