class Solution {
    public boolean isAnagram(String s, String t) {
        int[] counterS = new int[27];
        int[] counterT = new int[27];
        byte[] sChar = s.getBytes();
        byte[] tChar = t.getBytes();
        
        if(s.length() != t.length())
            return false;
        //97
        //122
        
        for(int i=0; i<s.length(); i++) {
            System.out.println("sChar: "+ sChar[i]+ " tChar: " + tChar[i]);
            int sIndex = sChar[i] - 97;
            int tIndex = tChar[i] - 97;
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
