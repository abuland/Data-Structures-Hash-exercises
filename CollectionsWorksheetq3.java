/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsworksheetq3;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Leicester Ow Buland
 */
public class CollectionsWorksheetq3 {

    
    
     /**
         * (Count the keywords in a Java source code). 
         * Revise the program in the notes. 
         * If a keyword is in a comment or a string, don’t count it.
         * Assume that the Java source code is correct and line comments 
         * and paragraph comments do not overlap.
     * @param args
     * @throws java.lang.Exception
         */
    
    
    public static void main(String[] args) throws Exception {
       
      Scanner input= new Scanner(System.in); 
        System.out.println("Enter a Java Source File");
        
        String filename= input.nextLine();
        File file= new File(filename);
        
        
        if(file.exists())
        {
            System.out.println("The Number of keywords in "+filename+"is"+countkeywords(file));
            
        }
        else
        {
            System.out.println("File "+filename+"does not exist");
        }  
    }//end of main method
    
    
    public static int countkeywords(File file) throws Exception
    {
        String []keywordString={"abstract","assert","boolean","continue","break","byte",
            "case","catch","char","class","const","default","do","double","else","enum","extends",
            "for","final","finally"};
        
        Set<String> keywordSet= new HashSet<>(Arrays.asList(keywordString));
        int count=0;
        Scanner in= new Scanner(file);
        while(in.hasNext())
        {
            String word=in.next();
            if(word.equals("//"))
            {
                in.nextLine();
            }
            else if(word.contains("\""))
            {
                String nextword;
                do{
                    nextword=in.next();
                }
            while(!nextword.contains("*/"));
                        }
            else
                if(keywordSet.contains(word))
                    count++;
           
        }
    return count;
    }
    
    
    
    
}
