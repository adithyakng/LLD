package LLDTicTacToe.src;

public class Board {
    public int size;
    public int occupiedCount;
    public PlayingPiece[][]board;

    public Board(int size) {
        this.size = size;
        board = new PlayingPiece[size][size];
        occupiedCount = 0;
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] == null ? " " : board[i][j].pieceType);
                if(j != size-1){
                    System.out.print("|");
                }
            }
            System.out.println();
        }
    }

    public boolean addMove(int x, int y, Player player) {
        if(occupiedCount == (size*size) || board[x][y] != null){
            return false;
        }
        board[x][y] = player.playingPiece;
        occupiedCount++;
        return true;
    }

    public boolean checkIfBoardFull() {
        return occupiedCount >= (size*size);
    }

    public boolean checkIfPositionWon(int x, int y, Player player) {
        if(board[x][y] != player.playingPiece){
            return false;
        }

        // Check Row
        int rx = x;
        int ry = y;

        int count = 0;
        for(int i=0; i<size; i++){
            count += board[rx][i] == player.playingPiece ? 1 : 0;
        }
        if(count == size){
            return true;
        }

        // Check Column
        count = 0;
        for(int i=0; i<size; i++){
            count += board[i][ry] == player.playingPiece ? 1 : 0;
        }
        if(count == size){
            return true;
        }

        // Check Diagonal
        if(x == y){
            count = 0;
            for(int i=0; i<size; i++){
                count += board[i][i] == player.playingPiece ? 1 : 0;
            }
            if(count == size){
                return true;
            }

            count = 0;
            for(int i=size-1, j= 0; i>=0 && j < size; i--,j++){
                count += board[j][i] == player.playingPiece ? 1 : 0;
            }
            if(count == size){
                return true;
            }
        }

        return false;
         

        
    }


}
