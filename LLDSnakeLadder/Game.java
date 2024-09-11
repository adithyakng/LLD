
import java.util.*;

import LLDSnakeLadder.src.Board;
import LLDSnakeLadder.src.Cell;
import LLDSnakeLadder.src.Dice;
import LLDSnakeLadder.src.Player;

public class Game {
    Deque<Player> players;
    Board board;
    Dice dice;
    Player winner;

    public Game(){
        init();
    }

    private void init(){
        winner = null;
        players = new LinkedList<>();
        // Create two players

        Player p1 = new Player("Adithya", 1, 0);
        Player p2 = new Player("CPU", 2, 0);
        players.add(p1);
        players.add(p2);

        // Create one dice

        dice = new Dice(1);

        // Create one Board
        board = new Board(10,10,5,5);
    }

    public void startGame(){
        System.out.println("Game Started");
        while(winner == null){
            Player current = getPlayer();
            int diceValue = dice.rollDice();
            
            System.out.println(current.playerName+" is at "+current.playerPosition+" and roolls "+diceValue);
            int nextPosition = current.playerPosition + diceValue;
            if(board.checkOutOfBoard(nextPosition)){
                System.out.println("Invalid Move");
                continue;
            }
            if(board.isFinalPosition(current.playerPosition)){
                winner = current;
                System.out.println("Winner is "+winner.playerName);
                break;
            }

            Cell nextCell = board.getCell(nextPosition);
            if(nextCell.jump != null){
                System.out.println(current.playerName+" is Jumping to "+nextCell.jump.end);
                nextPosition = nextCell.jump.end;
            }
            current.playerPosition = nextPosition;
            
        }
    }

    private Player getPlayer(){
        Player p = players.removeFirst();
        players.addLast(p);
        return p;
    }
}
