/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chanpter2_3;

/**
 *
 * @author aaronyang
 */
public abstract class AbstractPrograssion {
    protected long current;
    public AbstractPrograssion(){
        this(0);
    }
    public AbstractPrograssion( long start ){
        current = start;
    }
    
    public long nextValue(){
        long answer = current;
        advance();
        return answer;
    }
    
    public void printProgression(int n){
        System.out.print(nextValue());
        for(int j = 1; j < n; j++)
            System.out.print(" " + nextValue());
        System.out.println();
    }
    
    protected abstract void advance();
}
