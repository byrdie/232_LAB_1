
package pkg232_lab_1;

/**
 *
 * @author Roy
 */
public class Tree <E extends Pair> {
    private Node <E> root;
    
    Tree (E data){
        Node<E> temp = new Node<>(data);
        temp.setLeft(null);
        temp.setRight(null);
        root = temp;
    }
    
    public boolean insert(Node<E> data, Node<E> branchRoot){
        boolean inserted;
        
        if(branchRoot == null){
            branchRoot = data;
            return true;
        }else if((data.getData().compareTo(branchRoot.getData())) == 0){
            return false;
        }
        else if((data.getData().compareTo(branchRoot.getData())) < 0){
            inserted = insert(data, branchRoot.getLeft());
            if(inserted){ 
                branchRoot.setLeft(data);
            }
            return false;
        }
        else{
            inserted = insert(data, branchRoot.getRight());
            if(inserted) {
                branchRoot.setRight(data);
            }
            return false;
        }
    }
    
    void inorder(Node<E> node){
        if (node == null){
            return;
        }
        else{
            inorder(node.getLeft());
            System.out.println(node.getData().getInt());
            inorder(node.getRight());
        }
    }
    
    public Node getRoot(){
        return root;
    }
}
