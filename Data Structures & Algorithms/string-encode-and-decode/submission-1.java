class Solution {
    char caracterEspecial = '\0';
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String str : strs) {
          char[] base = new char[200];
          char[] palavra = str.toCharArray();

            for(int i=0;i<200; i++) {
                if(i < str.length())
                    base[i] =palavra[i];
                else 
                   base[i] = caracterEspecial;
            }
            sb.append(new String(base));
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        System.out.println("str= " + str);
        StringBuilder sb = new StringBuilder();
        char prova = caracterEspecial;
        
        List<String> palavras = new ArrayList<>();
        
        char[] strBytes = str.toCharArray();

        for(int i=0; i<strBytes.length; i+=200) {
            int j = 0;
            for(j=0;j<200; j++) {
                if(strBytes[i+j] == prova)
                    break;
            }
            char[] base = new char[j];
            for(int k =0;k<j; k++) {
                base[k] = strBytes[i+k];
            }
            palavras.add(new String(base));
        }

        return palavras;
    }
}
