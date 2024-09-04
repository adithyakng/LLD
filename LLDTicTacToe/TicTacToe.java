
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

import LLDTicTacToe.src.Board;
import LLDTicTacToe.src.Player;
import LLDTicTacToe.src.PlayingPieceO;
import LLDTicTacToe.src.PlayingPieceX;

public class TicTacToe {
    Deque<Player> players;
    Board board;

    public void initGame(){
        players = new LinkedList<>();
        Player p1 = new Player("Adithya", new PlayingPieceX());
        Player p2 = new Player("CPU", new PlayingPieceO());
        players.add(p1);
        players.add(p2);

        board = new Board(3);
    }

    public String startGame(){
        boolean winner = false;
        Scanner sc = new Scanner(System.in);
        while(!winner){
            if(board.checkIfBoardFull()){
                System.out.println("Draw");
                break;
            }
            Player p1 = players.pollFirst();
            int x,y;
            System.out.print(p1.playerName + "'s turn: Input Row and Column:");
            x = sc.nextInt();
            y = sc.nextInt();
            if(x >= board.size || y >= board.size || x < 0 || y < 0){
                System.out.println("Invalid Input");
                players.addFirst(p1);
                continue;
            }
            if(!board.addMove(x, y, p1)){
                System.out.println("Invalid Input");
                players.addFirst(p1);
                continue;
            }
            board.printBoard();
            if(board.checkIfPositionWon(x, y, p1)){
                System.out.println(p1.playerName + " Won");
                winner = true;
                break;
            }  
            players.addLast(p1);
        }
        sc.close();
        return "Draw";

    }
}
