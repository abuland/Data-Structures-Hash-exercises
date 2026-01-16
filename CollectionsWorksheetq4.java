/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsworksheetq4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Leicester Ow Buland
 */
public class CollectionsWorksheetq4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in= new Scanner(System.in);
        
        Map<Integer, Integer> map= new HashMap<>();
        System.out.println("Enter Number of Integers: "+"\nInput end when 0 is entered");
        
        int key;
        while((key= in.nextInt()) !=0)
        {
            if(!map.containsKey(key))
            {
                map.put(key, 1);
            }
            else
            {
                int freq= map.get(key);
                freq++;
                map.put(key, freq);
            }
        }
        
        int max= Collections.max(map.values());
        
        //Displaying the integers with the most occurences
        System.out.println("Reoccuring integers");
        for(Map.Entry<Integer, Integer> entry: map.entrySet())
        {
            if(entry.getValue() ==max)
            {
                System.out.println(entry.getKey()+ " ");
            }
            System.out.println();
        }
        
        
        
        
        
        
    }
    
}
