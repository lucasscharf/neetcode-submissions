class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> elementos = new HashSet<Integer>();
        for(int i : nums) {
            elementos.add(i);
        }

        int maior = 0;
        int atual = 0;
        
        for(int e : nums) {
            atual = 0;
            
            if(elementos.contains(e-1)) {
                continue;
            }

            int contador = e;

            while(elementos.contains(e)) {
                atual++;
                e++;
            }

            if(atual > maior) {
                maior = atual;
            }
        }

        return maior;
    }
}
