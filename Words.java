/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WordOccurrence;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Leicester Ow Buland
 * (CountOccurenceOfWords.java) from notes. 
 * Rewrite to display the words in ascending order of occurrence counts.
(Hint: Create a class name WordOccurence that implements the Comparable interface. 
* The class contains two fields, word and count.
* The compareTo method compares the counts. 
* For each pair in a hash set, create an instance of WordOccurence and store it in an array list.
* Sort the array list using the Collections.sort method.
* What would be wrong if you stored the occurrences in a tree set.
 * 
 * 
 */
public class Words {
    
    public static void main(String[] args) {
        
        String text= "Good Morning. Have a good class."+"Have a good visit. Have fun!";
        
        //Creating a map to hold the words as keys and count the values
        Map <String, Integer> map= new HashMap<>();
        
        //Count and storing the occurrence of each word
        String [] words= text.split("[ \n\t\r.,;:!?()]");
        
        for(String word: words)
        {
            String key= word.toLowerCase();
        
            if(key.length() >0)
            {
              if(!map.containsKey(key))
              {
                  map.put(key, 1);
              }
              else{
                  int value= map.get(key);
                  value++;
                  map.put(key, value);
              }
            }
        }
        
        //Creating ArrayList
        ArrayList<WordOccurrence> list= new ArrayList<>();
        
        //storing the key and value for each list entry
        map.entrySet().forEach((entry) -> {
            list.add(new WordOccurrence(entry.getKey(), entry.getValue()));
        });
        //Sorting list
        Collections.sort(list);
        //printing the list
        System.out.println(list);
        
        
        
        
        
        
        
    }
    
    
    
    
}
