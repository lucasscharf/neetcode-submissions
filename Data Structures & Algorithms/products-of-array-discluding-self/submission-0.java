class Solution {
    public int[] productExceptSelf(int[] nums) {
        //lidar com zeros depois
        long multiplicacao = 1;
        int[] retorno = new int[nums.length];
        boolean[] zeros = new boolean[nums.length];
        boolean temUmZero = false;
        boolean temDoisZero = false;

        for(int i = 0 ; i<nums.length ; i++) {
            int num = nums[i];
            if(num!=0)
                multiplicacao*=num;
            temDoisZero |= (temUmZero && num==0);
            temUmZero |= (num==0);
        }

        System.out.println("Tem um zero: " + temUmZero);
        System.out.println("Tem dois zero: " + temDoisZero);

        for(int i = 0 ; i<nums.length ; i++) {
            if(temDoisZero) {
                retorno[i] = 0;
            } else if(temUmZero && nums[i]!=0) {
                 retorno[i] = 0;
            } else if(temUmZero && nums[i]==0) {
                 retorno[i] = (int) (multiplicacao);
            } else {
                retorno[i] = (int) (multiplicacao / (long) nums[i]);
            }
        }
        return retorno;
        
    }
}  
