package class31;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileWriteDemo {
    public static void main(String[] args) throws IOException {
        //we need a path where we created a file and name it with its extension
        String path="Files/test.properties";
        //we use FileOutPutStream when we have to write the data to a file
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        Properties properties=new Properties();
        properties.setProperty("Name","Anees");
        properties.store(fileOutputStream,"A new name has been added");


    }
}
