import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Test_Udemy {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled");

        System.setProperty("webserver.chrome.driver", "D://QA_Auto/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Browser opened
        driver.get("https://udemy.com");

        //Login to Udemy
        WebElement logInButton = driver.findElement(By.xpath("//a[@data-purpose='header-login']"));
        logInButton.click();
        WebElement emailInput = driver.findElement(By.xpath("//input[@type='email']"));
        emailInput.sendKeys("p4th9i+bmkh8qj7ix710@guerrillamail.com");
        WebElement passwordInput = driver.findElement(By.xpath("//input[@type='password']"));
        passwordInput.sendKeys("1308password1308");
        WebElement logIn = driver.findElement(By.xpath("//input[@type='submit']"));
        logIn.click();

        //Searching for 'Selenium'
        WebElement searchInput = driver.findElement(By.xpath("//input[@type='text']"));
        searchInput.sendKeys("Selenium", Keys.ENTER);

        //Clicking on first course
        WebElement firstCourse = driver.findElement(By.xpath("//div[@class='course-list--container--3zXPS']/*[1]"));
        WebElement firstCourseNamePath = driver.findElement(By.xpath("//div[@class='course-list--container--3zXPS']/*[1]/a/div/div[2]/div"));
        String firstCourseName = firstCourseNamePath.getText();
        firstCourse.click();

        //Checking if 'addToCart' button visible in viewport and adding course to cart
        boolean addToCartButtonFlag = driver.findElement(By.xpath("//*[@id=\"udemy\"]/div[2]/div[3]/div[2]/div[2]/div/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[4]/div/button")).isDisplayed();
        if (addToCartButtonFlag) {
            WebElement addToCart = driver.findElement(By.xpath("//*[@id=\"udemy\"]/div[2]/div[3]/div[2]/div[2]/div/div/div/div[1]/div/div/div[2]/div/div[1]/div/div[4]/div/button"));
            addToCart.click();
        }
        else {
            WebElement addToCart = driver.findElement(By.xpath("//*[@id=\"udemy\"]/div[2]/div[3]/div[2]/div[3]/div/div/div[5]/div/div/div/div/div[1]/div/div[4]/div/button"));
            Actions addToCartClick = new Actions(driver);
            WebElement moveViewport = driver.findElement(By.xpath("//div[@class='bottom-container']"));
            addToCartClick.moveToElement(moveViewport).perform();
            addToCart.click();
        }

        //Going to cart and checking if the chosen course is in the cart
        WebElement goToCart = driver.findElement(By.xpath("//button[@data-purpose='go-to-cart-button']"));
        goToCart.click();

        WebElement courseInCart = driver.findElement(By.xpath("//ul[contains(@class,'styles--sc-shopping-list__items')][1]/div[last()]"));
        WebElement courseInCartNamePath = driver.findElement(By.xpath("//ul[contains(@class,'styles--sc-shopping-list__items')][1]/div[last()]/li/div/div[2]/a/div"));
        String courseInCartName = courseInCartNamePath.getText();

        //Checking if the right course is chosen
        if (firstCourseName.equals(courseInCartName) && courseInCart.isDisplayed()) {
            System.out.println("Test passed");
        }
        else {
            System.out.println("Test failed");
        }
    }
}
