import ecs100.*;
/**
 * Holds a collection of tiles in a 2d array
 * These tiles could hold a ship
 *
 * @author Ira
 * @version 13/9/21
 */
public class Board
{
    // fields
    static final int NUM_ROWS = 10;
    static final int NUM_COLUMNS = 10;
    private Tile board[][];

    /**
     * Constructor for objects of class Board
     */
    public Board()
    {
        // initialise instance variables
        board = new Tile[NUM_ROWS][NUM_COLUMNS];
        this.fillBoard();
    }
    
    /**
     * Fills the board with tiles
     */
    public Tile[][] fillBoard(){
        for (int row = 0; row < board.length; row++)
        {
            for (int col = 0; col < board[row].length; col++)
            {
                board[row][col] = new Tile(col, row, false); // Puts a tile in this spot
                UI.printf(String.valueOf(" " + board[row][col].getX()) + String.valueOf(board[row][col].getY()));
            }
            UI.println();
        }
        return this.board;
    }
}
