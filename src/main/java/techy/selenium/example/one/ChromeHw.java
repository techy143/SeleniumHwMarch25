package techy.selenium.example.one;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeHw {

    public static void main(String [] agrs){

        seleniumOne();

    }

    public static void seleniumOne(){

        System.setProperty("webdriver.chrome.driver","/Users/tuhidzmac/Projects/drivers/chromedriver");

        WebDriver driver= new ChromeDriver();
        driver.navigate().to("https://www.michigan.gov/coronavirus");
        String pagetitle = driver.getTitle();

        System.out.println(pagetitle);

        driver.quit();

    }

}
