
        
package pkg232_lab_1;

import java.util.Random;
/**
 *
 * @author Roy
 */
public class Main {

    static Random generator = new Random();
    
    public static void main(String[] args) {
        Element elem = createElement();
        Tree maple = new Tree(elem);
        
        
        fillTree(maple);
        Node root = maple.getRoot();
        maple.inorder(root);
    }
    
    static public void fillTree(Tree tree){
        Node root = tree.getRoot();
        for(int i = 0; i < 100; i++){
            Node data = createNode();
            
            
            tree.insert(data, root);
        }
    }
    
    static public Node createNode(){
        int num = generator.nextInt(100);
            Element elem = new Element(num , null);
            Node data = new Node(elem);
            return data;
    }
    
    static public Element createElement(){
        int num = generator.nextInt(100);
            Element elem = new Element(num , "s");
            return elem;
    }
}
