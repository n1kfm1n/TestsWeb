
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Registrationnegative {

    public WebDriver driver;
    public java.lang.String baseUrl = "https://twitter.com/";
    public String name = "Nikita Negative";
    public String email = "fmnnkt@negative.com";
    public String pass =  "00000000";

    @Test

    public void main() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl + "/");
        driver.findElement(By.name("user[name]")).sendKeys(name);
        driver.findElement(By.name("user[email]")).sendKeys(email);
        driver.findElement(By.name("user[user_password]")).sendKeys(pass);
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        Thread.sleep(3000);
        driver.close();
    }
}
