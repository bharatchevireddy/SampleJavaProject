package com.testing.MyProject;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     * @throws InterruptedException 
     */
    @Test
    public void shouldAnswerWithTrue() throws InterruptedException
    {
        //assertTrue( true );
        System.out.println( "Hello World!" );
        WebDriverManager.chromedriver().setup();
        //WebDriver driver = new FirefoxDriver();
    	WebDriver driver = new ChromeDriver();
    // To maximize the window
    //driver.manage().window().maximize();
    //driver.manage().window().maximize();
    // Open Application
    driver.get("https://www.google.co.in/");
    // Get text of a particular link
    //String FindElement = driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/h3/a")).getText();
    // Print the value of the link
    //System.out.println(FindElement);
    // Click on the link
    //driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/h3/a")).click();
    //driver.findElement(By.className("gNO89b")).click();

    //driver.findElement(By.className("RNmpXc")).click();
    //driver.findElement(By.xpath("//*[text()='Google Search']")).click();
   // driver.findElement(By.xpath("(//input[@type='text'])[last()]")).sendKeys("selenum jobs");
    //driver.findElement(By.xpath("(//input[@type='submit' and @name='btnk'])")).click();
    //driver.findElement(By.className("gNO89b")).click();
    //driver.getTitle();
    //Thread.sleep(3000);
    //driver.navigate().refresh();
    //Thread.sleep(3000);
    //driver.navigate().back();
    //Thread.sleep(3000);
    //driver.close();
   
    driver.manage().window().maximize();

	driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

	//Alert Box
	System.out.println(driver.findElement(By.id("output")).getText());
	driver.findElement(By.id("alertBox")).click();
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	System.out.println(driver.findElement(By.id("output")).getText());

	//Confirm Box
	System.out.println(driver.findElement(By.id("output")).getText());
	driver.findElement(By.id("confirmBox")).click();
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	System.out.println(driver.findElement(By.id("output")).getText());
	driver.findElement(By.id("confirmBox")).click();
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().dismiss();
    System.out.println(driver.findElement(By.id("output")).getText());

	//Prompt Box
	System.out.println(driver.findElement(By.id("output")).getText());
	driver.findElement(By.id("promptBox")).click();
    System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().sendKeys("HYR Tutorials");
	driver.switchTo().alert().accept();
	System.out.println(driver.findElement(By.id("output")).getText());
	driver.findElement(By.id("promptBox")).click();
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().dismiss();
	System.out.println(driver.findElement(By.id("output")).getText());

	driver.quit();
    
    }
   
}
