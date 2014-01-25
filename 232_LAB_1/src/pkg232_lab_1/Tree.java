
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
    
    int[] inorder(Node<E> node, int[] list){
        if (node == null){
            return list;
        }
        else{
            list = inorder(node.getLeft(), list);
            list[list[0]] = (node.getData().getInt());
            list[0]++;
            list = inorder(node.getRight(), list);
        }
        return list;
    }
    
    int[] preorder(Node<E> node, int[] list){        
        if (node == null){
            return list;
        }
        else{
            list[list[0]] = (node.getData().getInt());
            list[0]++;
            preorder(node.getLeft(), list);           
            preorder(node.getRight(), list);
        }
        return list;
    }
    
    int[] postorder(Node<E> node, int[] list){
        if (node == null){
            return list;
        }
        else{
            postorder(node.getLeft(), list);           
            postorder(node.getRight(), list);
            list[list[0]] = (node.getData().getInt());
            list[0]++;
        }
        return list;
    }
    
    public Node getRoot(){
        return root;
    }
}
