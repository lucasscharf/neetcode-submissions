class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean isValid = true;

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();    
        }

        for(int i=0;i<9;i++){
            boolean[] linhas = new boolean[9];
            for(int j=0;j<9;j++){
                int val = board[i][j] - '1';
                if(val >= 0 && linhas[val]) {
                    isValid = false;
                }
                if(val >= 0)
                    linhas[val] = true;
            }
        }

        for(int i=0;i<9;i++){
            boolean[] colunas = new boolean[9];
            for(int j=0;j<9;j++){
                int val = board[j][i] - '1';
                if(val >= 0 &&colunas[val]) {
                    isValid = false;
                }
                if(val >= 0)
                  colunas[val] = true;
            }
        }

        for(int i=0;i<9;i+=3){
            for(int j=0;j<9;j+=3){
                boolean[] quadrados = new boolean[9];
                for(int k=0;k<3;k++){
                    for(int l=0;l<3;l++){
                        int val = board[i+k][j+l] - '1';
                            if(val >= 0 && quadrados[val]) {
                                isValid = false;
                            }
                            if(val >= 0)
                                quadrados[val] = true;
                        }
                    }
                }
        }

        return isValid;
    }
}
