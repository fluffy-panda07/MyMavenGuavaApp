package com.example;
import com.google.common.collect.ImmutableList;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ImmutableList<String> fruits= ImmutableList.of("Apple","Banana","Cherry");
        System.out.println(fruits);
        File sourceFile =new File("source.txt");
        File destFile =new File("destination.txt");
        try{
        	FileUtils.copyFile(sourceFile,destFile);
        	System.out.println("File Copied Successfully");
        	}
        catch(IOException e){
        	System.err.println("Error occured in copying file " +e.getMessage());
        	}       
        
        
        
    }
}
