class Solution {
    public boolean isValidSudoku(char[][] board) {
        // making arrays of hashset of length 9, example: there will be 9 rows, leading to 9 individual hashsets as in rows[0] hashset will have values form 1 to 9, rows[1] hashet will have values from 0 to 9:
        HashSet<Character>[] rows=new HashSet[9];
        HashSet<Character>[] cols=new HashSet[9];
        HashSet<Character>[] boxes=new HashSet[9];
        // initializaing a hashset at each index of hashset that is making a row say at index 0 like rows[0] a hashset of 9 values from 1-9:
        for(int i=0;i<9;i++){
            rows[i]=new HashSet<>();
            cols[i]=new HashSet<>();
            boxes[i]=new HashSet<>();
        }
        //chechking value at every index i and j fomboard and checking if it lies in that rows hashset or not like for i=0,j=0, the value at board[0][0] say 5 here exists in rows[0] hashset and cols[0] hashset and box[0] hashset or not, if it exist means value is already there somewhere in that row, col or box leading to a false return i.e a false sudoku
        for(int i=0;i<board[0].length;i++){
            for(int j=0;j<board.length;j++){
                // empty value in sudoku:
                if(board[i][j]== '.'){
                    continue;
                }
                char value=board[i][j];
                int BoxNumber=i/3*3+j/3;
                if(rows[i].contains(value) || cols[j].contains(value) || boxes[BoxNumber].contains(value)){
                    return false;
                }
                // in case when value is not in hashset we add it in hasset for further comparison:
                rows[i].add(value);
                cols[j].add(value);
                boxes[BoxNumber].add(value);
            }
        }
        return true;
    }
}