package implementations;
import com.love2code.utilities.PropertyManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class StepImplementation {

    //Test Data from configuration properties file
    String baseURL = PropertyManager.getInstance().getUrl();
    String userName = PropertyManager.getInstance().getUserName();
    String password = PropertyManager.getInstance().getPassword();
    String chromeDriverUrl=PropertyManager.getInstance().getChromeDriverUrl();

    private WebDriver driver;
    By altenUserName = By.name("userName");
    By altenPassword = By.name("password");
    By login = By.id("loginButton");


    //This method verifies that the response code of the url is 200, the website is accessible
    public void testCodeHTTPResponse() throws IOException {
        URL url = new URL(baseURL);
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();
        int realCode = connection.getResponseCode();
        int expectedCode=200;
        Assert.assertTrue(realCode==expectedCode);
    }

        // this method opens this url: http://172.21.0.93:8080/production/login.html
        public  void loadAltenWebSite() {
        System.setProperty("webdriver.chrome.driver",chromeDriverUrl);
        // Create a new instance of the Chrome driver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Launch the Alten Website
        driver.get(baseURL);

    }

    //Fill up the login form and click the login buttton
    public void setUserAndPassword() {
        driver.findElement(altenUserName).sendKeys(userName);
        driver.findElement(altenPassword).sendKeys(password);
        driver.findElement(login).click();
    }

        // Verifies if the login field exists
    public void verifyLoginField() {
        Assert.assertTrue(!driver.findElements(login).isEmpty());
        /*By loginButton = By.xpath("//button[@value='login']");
        Assert.assertTrue(driver.findElement(loginButton).isDisplayed());
        */
    }

    //This method verifies that we are in My Profile page
    public void verifyMyProfilePage(){
        String urlExpected="";
        String currentUrl=driver.getCurrentUrl();
        Assert.assertEquals(urlExpected, currentUrl);
    }

    // This method verifies that button 'edit profile' is displayed
    public void verifyButtonEditProfile(){
        By editProfileButton = By.xpath("//button[@value='edit profile']");
        Assert.assertTrue(driver.findElement(editProfileButton).isDisplayed());
    }
}
