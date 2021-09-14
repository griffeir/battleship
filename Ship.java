import ecs100.*;
/**
 * Support class of Board
 * A ship stores how large it is and how many times it has been hit
 *
 * @author Ira
 * @version 14/09/21
 */
public class Ship
{
    // fields
    private int hit; // stores whether ship has been hit
    private int size; 
    

    /**
     * Constructor for objects of class Ship
     */
    public Ship(int hit, int size)
    {
        // initialise instance variables
        this. hit = hit;
        this.size = size;
    }
    
    /**
     * Getter for Hit
     * 
     * @return hit
     */
    public int getHit() {
        return this.hit;   
    }
    
    /**
     * Getter for size
     * 
     * @return hit
     */
    public int getSize() {
        return this.size;   
    }
}
