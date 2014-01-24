
package pkg232_lab_1;

/**
 *
 * @author Roy
 */
public class Tree <E extends Comparable>{
    private Node <E> root;
    
    Tree (E data){
        Node<E> temp = new Node<>(data);
        temp.setLeft(null);
        temp.setRight(null);
        root = temp;
    }
    
    public boolean insert(Node<E> data, Node<E> root){
        if(root == null){
            root  = data;
        }else if(root.getData().){
            
        }
    }
}
