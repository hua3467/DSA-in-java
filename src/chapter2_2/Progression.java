package chapter2_2;

/**
 *
 * @author aaronyang
 */
public class Progression {
    
    protected long current;
    
    /** Constructs a progression starting at zero.*/
    public Progression(){
        this(0);
    }
    
    /** Constructs a progression with given start value.*/
    public Progression(long start){
        current = start;
    }
    
    /** Return the next value of the progression.*/
    public long nextValue(){
        long answer = current;
        advance();  // this protected call is responsible for advancing the current value
        return answer;
    }
    
    /** Advances the current value to the next value of the progression. */
    protected void advance(){
        current++; 
    }
    
    /** Prints the next n values of the progression, separated by spaces. */
    public void printProgression(int n){
        System.out.print(nextValue());
        for(int j = 1; j < n; j++)
            System.out.print(" " + nextValue());
        System.out.println("");
    }
}
