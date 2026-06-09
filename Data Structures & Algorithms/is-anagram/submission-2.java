class Solution {
    public boolean isAnagram(String s, String t) {
        int[] counterS = new int[27];
        int[] counterT = new int[27];
        
        
        if(s.length() != t.length())
            return false;

        for(int i=0; i<s.length(); i++) {
            int sIndex = s.charAt(i) - 97;
            int tIndex = t.charAt(i) - 97;
            counterS[sIndex]++;
            counterT[tIndex]++;
        }

        for(int i = 0; i<counterS.length; i++) {
            if(counterS[i] != counterT[i])
                return false;
        }

        return true;
    }
}
