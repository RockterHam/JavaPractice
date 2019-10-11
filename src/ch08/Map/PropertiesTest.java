package ch08.Map;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        Properties props = new Properties();
        props.setProperty("username","Rockter");
        props.setProperty("password","123456");
        props.store(new FileOutputStream("PropertiesFile.txt"),"comment line");
        Properties props2 = new Properties();
        props2.setProperty("gender","male");
        props2.load(new FileInputStream("PropertiesFile.txt"));
        System.out.println(props2);
    }
}
