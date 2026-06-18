class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        
        for(char c : chars) {
            if((c>='a' && c <='z')||(c>='A' && c <='Z')||(c>='0' && c <='9'))
                sb.append(c);
        }
        String ss = sb.toString().toLowerCase();

        for(int i = 0; i<ss.length(); i++) {
            if(ss.charAt(i) != ss.charAt(ss.length() - i -1))
                return false;
        }

        return true;
    }
}
