/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg232_lab_1;

/**
 *Pair is implemented so that the values associated with Element
 * can still be accessed from generic class types, I would've just
 * extended E to compare to and Element but java can't extend two classes
 * so I had to have an intermediate interface to accomplish this.
 * @author byrdie
 */
public interface Pair extends Comparable {
    //int compareTo(Object element);
    
    int getInt();
    String getString();
}
