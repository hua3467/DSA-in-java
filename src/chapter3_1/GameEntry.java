package chapter3_1;

/**
 *
 * @author aaronyang
 */
public class GameEntry {
    private String name;
    private int score;
    
    /**Constructs a game entry with given parameters..*/
    public GameEntry(String n, int s){
        name = n;
        score = s;
    }
    /**Returns the name field.*/
    public String getName(){ return name; }
    /** Returns the score field.*/
    public int getScore(){ return score; }
    /** Returns a string representation of this entry.*/
    public String toString(){
        return "(" + name + ", " + score + ")";
    }
}
