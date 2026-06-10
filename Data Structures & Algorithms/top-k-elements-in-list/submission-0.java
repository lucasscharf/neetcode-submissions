class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        No[] elementos = new No[2_002];
        for(int i = 0; i < 2_002; i++) {
            elementos[i] = new No(i-1000);
        }
        for(int i : nums) {
            elementos[i+1000].increment();
        }

        Arrays.sort(elementos);

        int[] top = new int[k];
        for(int i = 0; i<k; i++) {
            top[i] = elementos[i].index;
        }

        return top;
    }

    class No implements Comparable<No> {
        final int index;
        int count;

        public No(int index) {
            this.index = index;
            count = 0;
        }

        public void increment() {
            count++;
        }

        public int compareTo(No outro) {
            if(outro == null) return 1;
            return outro.count - count;
        }
    }
}
