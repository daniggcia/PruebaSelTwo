package org.eso3.PruebaSel22;



import java.util.List;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;



public class App {


private WebDriver driver;
private WebDriverWait wait;

@Test

public void testSelenium() throws InterruptedException {

WebDriverManager.chromedriver().version("93").setup();
ChromeOptions options = new ChromeOptions();
options.addArguments("--no-sandbox");
options.addArguments("--disable-gpu");
options.addArguments("--start-maximized");
options.addArguments("--incognito");
driver = new ChromeDriver(options);
driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
wait = new WebDriverWait(driver, 5);
driver.get("https://www.toolsqa.com");



driver.findElement(By.xpath("//div/main/button")).click();

driver.findElement(By.xpath("//button[text()='Accept']")).click();

List<WebElement> listMenu = driver.findElements(By.xpath("//span[@class='navbar__tutorial-menu--menu-bars']"));

listMenu.forEach(x -> System.out.println(x.getText()));

List<WebElement> listSocialNetwork = driver.findElements(
By.xpath("//div[@class='right-widgets mini-widgets']/div[not(contains(@class,'display-none'))]/a"));

listSocialNetwork.forEach(x -> System.out.println(x.getAttribute("href")));

driver.findElement(By.xpath("//i[@class=' mw-icon the7-mw-icon-search-bold']")).click();

driver.findElement(By.xpath("//input[@name='s']")).sendKeys("postman" + Keys.ENTER);

Thread.sleep(5000);

JavascriptExecutor jse6 = (JavascriptExecutor) driver;

jse6.executeScript("window.scrollBy(0,1000)", "");

Thread.sleep(5000);

jse6.executeScript("window.scrollBy(0,1000)", "");

Thread.sleep(5000);

jse6.executeScript("window.scrollBy(0,1000)", "");

List<WebElement> listTitle = driver.findElements(By.xpath("//h3/a"));
listTitle.forEach(x -> System.out.println(x.getText()));

driver.quit();
}

}




