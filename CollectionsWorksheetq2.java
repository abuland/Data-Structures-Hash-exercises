/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsworksheetq2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.TreeSet;

/**
 *
 * @author Leicester Ow Buland
 */
public class CollectionsWorksheetq2 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     * 
     * Display non duplicate words in ascending order). 
     * Write a program that reads words from a text file and
     * displays all the non-duplicate words in ascending order.
     */
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
    
        if(args.length !=1)
        throw new InvalidParameterException("Usage: fullFilePathName");
        
        File file = new File (args[0]);
        if(!file.isFile())
            throw new FileNotFoundException(file + "is not a file.");
      
        try(BufferedReader in= new BufferedReader(new InputStreamReader(new FileInputStream(file)),1000))
        {
            String input;
            StringBuilder stringbuild= new StringBuilder(10000);
            while((input= in.readLine()) !=null)
                stringbuild.append(input);
            
            String [] words= stringbuild.toString().split("\\s+");
            TreeSet<String> nondupwords= new TreeSet<>(Arrays.asList(words));
            
            for(String s: nondupwords)
                System.out.println(s);
            
            
            
        }  
        catch(IOException e )
                {
                e.printStackTrace();
                System.exit(0);
                }
        
        
        
        
    }
    
}
