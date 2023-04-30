package review11;

import Homework12.Palindrome;
import class24.File;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;

public class ConfigFile {
    public static void main(String[] args)  {
        //location of the file
        //We are reading the data from file
        String path="Files/config.properties";
        //navigating to the file
        try {
            FileInputStream fileInputStream=new FileInputStream(path);
            Properties properties=new Properties();
            properties.load(fileInputStream);
            System.out.println(properties.getProperty("user"));
        } catch (FileNotFoundException e) {
            System.out.println("something went wrong");
        }catch (NullPointerException e){
            System.out.println("You are trying to call method on null object");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
