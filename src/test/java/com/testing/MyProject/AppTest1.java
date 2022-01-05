package com.testing.MyProject;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.Iterator;
import java.util.Set;

public class AppTest1 
{
    /**
     * Rigorous Test :-)
     * @throws InterruptedException 
     */
    @Test
    public void shouldAnswerWithTrue1() throws InterruptedException
    { 
    	WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");

//        // Open new window by clicking the button
//         driver.findElement(By.id("windowButton")).click();
//
//         // Click on the new window element and read the text displayed on the window
//         WebElement text = driver.findElement(By.id("sampleHeading"));
//   
//         // Fetching the text using method and printing it     
//         System.out.println("Element found using text: " + text.getText());
//         driver.quit();
        
        
//     // Open new child window within the main window
//        driver.findElement(By.id("windowButton")).click();
//
//        //Get handles of the windows
//        String mainWindowHandle = driver.getWindowHandle();
//        Set<String> allWindowHandles = driver.getWindowHandles();
//        Iterator<String> iterator = allWindowHandles.iterator();
//
//        // Here we will check if child window has other child windows and will fetch the heading of the child window
//        while (iterator.hasNext()) {
//            String ChildWindow = iterator.next();
//                if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
//                driver.switchTo().window(ChildWindow);
//                WebElement text = driver.findElement(By.id("sampleHeading"));
//                System.out.println("Heading of child window is " + text.getText());
//    }
//}  
//        driver.findElement(By.id("windowButton")).click();
//        String mainwindow = driver.getWindowHandle();
//        Set<String> s1 = driver.getWindowHandles();
//        Iterator<String> i1 = s1.iterator();
//        
//        while (i1.hasNext()) {
//            String ChildWindow = i1.next();
//                if (!mainwindow.equalsIgnoreCase(ChildWindow)) {
//                driver.switchTo().window(ChildWindow);
//                WebElement text = driver.findElement(By.id("sampleHeading"));
//                System.out.println("Heading of child window is " + text.getText());
//                driver.close();
//                System.out.println("Child window closed");
//            }
//        }    
//        //  Switch back to the main window which is the parent window.
//        driver.switchTo().window(mainwindow);
//        Thread.sleep(3000);
//        driver.quit();
        
        String mainwindow = driver.getWindowHandle();
        System.out.println("manwndow:"+mainwindow);
        driver.findElement(By.id("windowButton")).click();
        Set<String> s1 = driver.getWindowHandles();
        
        for(String s:s1)
        {
        driver.switchTo().window(s);	
        System.out.println(s+driver.getTitle());
        }
        
        Thread.sleep(3000);
        driver.quit();

}
}