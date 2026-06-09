class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<Anagramas> list = new ArrayList<>();
        List<List<String>> todasPalavras = new ArrayList<>();

        for(int i=0 ; i < strs.length ; i++) {
            boolean match = false;
            for(Anagramas anagrama : list) {
                match = anagrama.addAnagrama(strs[i]);
                if(match) {
                    break;
                }
            }

            if(!match) {
                Anagramas novoAnagrama = new Anagramas(strs[i]);
                list.add(novoAnagrama);
                todasPalavras.add(novoAnagrama.getPalavras());
            }
            match = false;
        }

        return todasPalavras;
    }

    class Anagramas {
        String representativo;
        List<String> palavras;
        
        public Anagramas(String representativo) {
            this.representativo = representativo;
            palavras = new ArrayList<>();
            palavras.add(representativo);
        }

        public boolean addAnagrama(String candidato) {
            boolean isAnagrama = isAnagrama(representativo, candidato);

            if(isAnagrama) {
                palavras.add(candidato);
            }
            return isAnagrama; 
        }

        public boolean isAnagrama(String str1, String str2) {
            if(str1.length() != str2.length())
                return false;

            int[] vetor1 = new int[27], vetor2 = new int[27];

            for(int i = 0; i<str1.length(); i++) {
                char v1 = str1.charAt(i);
                char v2 = str2.charAt(i);

                vetor1[v1-'a']++;
                vetor2[v2-'a']++;
            }

            for(int i = 0; i<vetor1.length; i++) {
                if(vetor1[i] != vetor2[i]) 
                    return false;
            }

            return true;
        }

        public List<String> getPalavras() {
            return palavras;
        }
    }
}
