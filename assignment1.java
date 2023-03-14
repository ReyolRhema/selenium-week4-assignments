package seleniumclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment1 {
	public static void main(String[] args) {
	 
		EdgeDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("febBatch");
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("reyol");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("rhema");
	    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("local");
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("seleniumTesting");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("reyol.rhema.1238@gmail.com");
        driver.findElement(By.id("createLeadForm_description")).sendKeys("learning basics of automation testing using selenium tool");
        
     WebElement provideState = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
     Select dropdown =new Select(provideState);
     dropdown.selectByValue("NY");
     
     driver.findElement(By.className("smallSubmit")).click();
     
     System.out.println("the title resulting page is " + driver.getTitle());
     
     driver.close();
     
     
        
        
        
        
        
        
        
        
        
        
}}
