package LLDSnakeLadder.src;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Board {
    int rows;
    int cols;
    Cell cells[][];
    int snakesCount;
    int laddersCount;

    public Board(int rows, int cols, int snakesCount, int laddersCount) {
        this.rows = rows;
        this.cols = cols;
        this.snakesCount = snakesCount;
        this.laddersCount = laddersCount;
        cells = new Cell[rows][cols];

        for(Cell r[]: cells){
            Arrays.fill(r, new Cell());
        }
        

        addSnakeLadders();
    }

    private void addSnakeLadders(){
        int snakesCountTemp = 0;
        while(snakesCount != snakesCountTemp){
            int start = ThreadLocalRandom.current().nextInt(0, rows*cols);
            int end = ThreadLocalRandom.current().nextInt(0, rows*cols);
            if(start == end || start < end){
                continue;
            }
            Jump snake = new Jump(start, end);
            Cell c = getCell(start);
            c.jump = snake;
            snakesCountTemp++;
        }
        int laddersCountTemp = 0;
        while(laddersCount != laddersCountTemp){
            int start = ThreadLocalRandom.current().nextInt(0, rows*cols);
            int end = ThreadLocalRandom.current().nextInt(0, rows*cols);
            if(start == end || start > end){
                continue;
            }
            Jump ladder = new Jump(start, end);
            Cell c = getCell(start);
            if(c == null){
                continue;
            }
            c.jump = ladder;
            laddersCountTemp++;
        }
    }

    public Cell getCell(int position){
        return cells[position/rows][position%cols];
    }

    public boolean checkOutOfBoard(int position){
        if(position < 0 || position > rows*cols){
            return true;
        }
        return false;
    }

    public boolean isFinalPosition(int position){
        if(position == rows*cols-1){
            return true;
        }
        return false;
    }

}
