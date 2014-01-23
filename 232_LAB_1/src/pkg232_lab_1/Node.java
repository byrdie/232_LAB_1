/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg232_lab_1;

/**
 *
 * @author Roy
 */
public class Node<E> {
    private E data;
    private Node<E> leftNode;
    private Node<E> rightNode;
    
    public Node (E data){
        this.data = data;
        this.leftNode = null;
        this.rightNode = null;
    }
    
    public void setLeft(Node<E> what){
        this.leftNode = what;
    }
    
    public void setRight(Node<E> what){
        this.rightNode = what;
    }
    
    public E getData(){
        return data;
    }
    
    public Node<E> getLeft(){
        return leftNode;
    }
    
    
}
