package techy.selenium.example.one;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariHw {

    public static void main(String [] agrs){

        seleniumthree();

    }

    public static void seleniumthree(){

        //System.setProperty("Webdriver.chrome.driver","/Users/tuhidzmac");

        WebDriver driver= new SafariDriver();
        driver.navigate().to("https://www.yahoo.com/");
        String pagetitle = driver.getTitle();

        System.out.println(pagetitle);

        driver.quit();

    }
}