import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Logout {

    public WebDriver driver;
    public java.lang.String baseUrl = "https://twitter.com/";
    public String email = "fmnnkt@gmail.com";
    public String pass =  "trewq312";

    @Test
    public void main() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl + "/?lang=ru");
        driver.findElement(By.id("signin-email")).sendKeys(email);
        driver.findElement(By.id("signin-password")).sendKeys(pass);
        driver.findElement(By.xpath("//div[@id='front-container']/div[2]/div[2]/form/table/tbody/tr/td[2]/button")).click();
        driver.findElement(By.id("user-dropdown-toggle")).click();
        driver.findElement(By.cssSelector("#signout-button > button.dropdown-link")).click();
        Thread.sleep(3000);
        driver.close();
    }
}
