
package pkg232_lab_1;

/**
 *
 * @author Roy
 */
public class Tree <E extends Comparable> implements Pair<K,V>{
    private Node <E> root;
    
    Tree (E data){
        Node<E> temp = new Node<>(data);
        temp.setLeft(null);
        temp.setRight(null);
        root = temp;
    }
    
    public boolean insert(Node<E> data, Node<E> branchRoot){
        if(branchRoot == null){
            branchRoot  = data;
            return true;
        }else if((data.getData().compareTo(branchRoot.getData())) == 0){
            return false;
        }
        else if((data.getData().compareTo(branchRoot.getData())) < 0){
            insert(data, branchRoot.getLeft());
        }
        else{
            insert(data, branchRoot.getRight());
        }
        return false;
    }
    
    void inorder(Node<E> node){
        if (node == null){
            return;
        }
        else{
            inorder(node.getLeft());
            node.getData().
        }
    }
}
