/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter2_5;

/**
 *
 * @author aaronyang
 */
public class ObjectPair {
    Object first;
    Object second;
    public ObjectPair(Object a, Object b){
        first = a;
        second = b;
    }
    public Object getFirst(){ return first; }
    public Object getSecond(){ return second; }
}
