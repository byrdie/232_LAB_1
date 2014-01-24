
package pkg232_lab_1;

/**
 *
 * @author byrdie
 */
abstract class Element<K, V> implements Pair<K, V> {
    private int num;
    private String string;
    
    private K key;
    private V value;
    
    
    Element(int i, String s){
        this.num = i;
        this.string = s;
    }
    
    public int compareTo(Object element){
        Element otherElement = (Element) element;

        if(string.compareTo(otherElement.string) < 0){
            return -1;
        }else if(string.compareTo(otherElement.string) == 0){
            if(num < otherElement.num){
                return -1;
            }else if(num == otherElement.num){
                return 0;
            }else{
                return 1;
            }
        }else{
            return 1;
        }
    }
}
