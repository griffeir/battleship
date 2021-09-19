import ecs100.*;

/**
 * Class to handle the GUI functionality
 *
 * @author Ira
 * @version 14/9/21
 */
public class GUI
{
    // fields
    private Board board; // declare instance of board
    
    /**
     * Constructor for objects of class GUI
     */
    public GUI()
    {
        // initialise instance variables
        board = new Board();
        UI.initialise();
        printBoard();
        UI.addButton("Quit", UI::quit);
    }
    
    /**
     * Prints the board
     */
    public void printBoard() 
    {
        
    }
}

