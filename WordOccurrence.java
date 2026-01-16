/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WordOccurrence;

/**
 *
 * @author Leicester Ow Buland
 */
public class WordOccurrence implements Comparable<WordOccurrence>{
  
String word;
Integer count;

public WordOccurrence(String word, int count){
    this.word = word;
    this.count = count;
}

@Override
public int compareTo(WordOccurrence o) {
	return o.count.compareTo(count);
}

@Override
public String toString() {
return word + "=" + count;
}
    

    
    
    
    
}
