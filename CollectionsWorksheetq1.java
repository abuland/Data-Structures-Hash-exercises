/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsworksheetq1;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Leicester Ow Buland
 * 
 * (Perform set operations on hash sets) 
 * Create two hash sets(“George”,”Jim”,”John”,”Blake”, “Kevin”, “Michael”} 
 * and {“George”, “Katie”,”Kevin”,”Michelle”,”Ryan”} and
 * find their union, difference, and intersection. 
 * (You can clone the sets to preserve the original sets from being changed by these set methods.)

 * 
 */
public class CollectionsWorksheetq1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Set <String> set= new HashSet<>();
        set.add("George");
        set.add("Jim");
        set.add("John");
        set.add("Blake");
        set.add("Kevin");
        set.add("Michael");
        
        System.out.println("Set 1: "+set);
        
        Set <String> set2= new HashSet<>();
        set2.add("George");
        set2.add("Katie");
        set2.add("Kevin");
        set2.add("Michelle");
        set2.add("Ryan");
        
        System.out.println("Set 2: "+set2);
        
        set.addAll(set2);
        System.out.println("Union: "+set);
        
        set.removeAll(set2);
        System.out.println("Difference: "+set);
        
        set.retainAll(set2);
        System.out.println("Intersection: "+set);
        
        
        
        
        
        
        
        
    }
    
}
