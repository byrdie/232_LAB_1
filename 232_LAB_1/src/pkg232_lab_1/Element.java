
package pkg232_lab_1;

/**
 *
 * @author byrdie
 */
public class Element implements Pair, Comparable {
    public int num;
    public String string;
    
    public Element(int i, String s){
        this.num = i;
        this.string = s;
    }
    
    @Override
    public int compareTo(Object element){
        Element otherElement = (Element) element;

 //       if(string.compareTo(otherElement.string) < 0){
  //          return -1;
   //     }else if(string.compareTo(otherElement.string) == 0){
            if(num < otherElement.num){
                return -1;
            }else if(num == otherElement.num){
                return 0;
            }else{
                return 1;
            }
//        }else{
 //           return 1;
 //       }
    }
    
    
    @Override
    public int getInt(){
        return num;
    }
    
    @Override
    public String getString(){
        return string;
    }
}
