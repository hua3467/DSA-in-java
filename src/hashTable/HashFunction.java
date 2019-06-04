/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashTable;
import java.util.Arrays;
/**
 *
 * @author aaronyang
 */
public class HashFunction {
    
    String[] theArray;
    int arraySize;
    int itemsInArray = 0;
    
    public static void main(String[] args) {
        
        HashFunction theFunc = new HashFunction(20);
        
        String[] elementsToAdd = { "1", "5", "17", "21", "26"};
        
        theFunc.hashFunction1(elementsToAdd, theFunc.theArray);
    }
    
    public void hashFunction1(String[] stringsForArray, String[] theArray){
        for( int n = 0; n < stringsForArray.length; n++){
            String newElementVal = stringsForArray[n];
            theArray[Integer.parseInt(newElementVal)] = newElementVal;
        }
    }
    
    HashFunction(int size){
        arraySize = size;
        theArray = new String[size];
        Arrays.fill(theArray, "-1");
    }
}
