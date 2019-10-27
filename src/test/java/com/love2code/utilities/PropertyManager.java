package com.love2code.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/*
singleton design pattern to create the PropertyManager class only one time.
In this way, we read and load the configuration data only one time.
After the first call, we get the PropertyManager instance/object via getInstance() method.
loadData() method reads the configuration.properties file and assign the variables to the private variables.
Lastly, we have getter methods to reach the variables such as getURL(), getPassword(), getUsername().
 */
public class PropertyManager {

    private static PropertyManager instance;
    private static final  Object lock = new Object();
    private static String propertyFilePath = System.getProperty("user.dir")+ "\\src\\test\\resources\\configuration.properties";
    private static String url;
    private static String userName;
    private static String password;
    private static String chromeDriverUrl;

    // Create a Singleton instance, we need only one instance of Property Manager.
    public static PropertyManager getInstance(){
        if(instance== null){
            synchronized (lock){
                instance=new PropertyManager();
                instance.loadData();
            }
        }
        return instance;
    }

    //Get all configuration data and assign to related fields.
    private void loadData(){
        // Declare a properties object
        Properties prop=new Properties();

        // Read configuration.properties file
        try{
            prop.load(new FileInputStream(propertyFilePath));

        } catch(IOException e){
            System.out.println("Configuration properties file cannot be found");

        }

        //Get properties from configuration.properties
        url=prop.getProperty("url");
        userName=prop.getProperty("userName");
        password=prop.getProperty("password");
        chromeDriverUrl=prop.getProperty("chromedriver");

    }

    public static String getUrl() {
        return url;
    }

    public String getUserName() {
        return userName;
    }

    public  String getPassword() {
        return password;
    }

    public String getChromeDriverUrl() {
        return chromeDriverUrl;
    }
}
