package support;

import java.nio.channels.spi.AbstractSelectableChannel;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class temp8 
{
public static WebDriver driver=null;

public static void blaunch(Object[]inputparameters) 
{
	String strk=(String)inputparameters[0];
	String xapath=(String)inputparameters[1];
	
	if(strk.equalsIgnoreCase("chrome")) 
	{
		System.setProperty("webdriver.chrome.driver", xapath);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}else if(strk.equalsIgnoreCase("Edge")) 
	{			System.setProperty("webdriver.edge.driver", xapath);
				driver=new EdgeDriver();
				driver.manage().window().maximize();
	}
	}

public static void openlaunch(Object[]inputparameters)  
{
	String opeurl=(String)inputparameters[0];
	driver.get("http://primusbank.qedgetech.com/");
}
public static void wait1()
{
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
}
public static void enteruser(Object[]inputparameters)
{
	String enterus=(String)inputparameters[0];
	String enterpw=(String)inputparameters[1];
    WebElement b=driver.findElement(By.xpath(enterus));
	b.clear();
	b.sendKeys(enterpw);
}
// public static void clickonbutton(Object[]inputparameters)
public static void clickloging(Object[]inputparameters)  
{
   String clicklg=(String)inputparameters[0];
   WebElement ad= driver.findElement(By.xpath(clicklg));
   ad.click();
  
}
public static void clickoncoun(Object[]inputparameters) 
{  String clicklg=(String)inputparameters[0];
   String clicklg3=(String)inputparameters[1];
   WebElement ad= driver.findElement(By.xpath(clicklg));
   Select abc=new Select(ad);
   abc.selectByValue(clicklg3);
	
}
public static void main(String[] args) {
	    Object[]input=new Object[2];
	    input[0]="chrome";
	    input[1]="E:\\Automation Support\\chromedriver.exe";
	    blaunch(input);
	    
	    Object[]input1=new Object[1];
	    input1[0]="http://primusbank.qedgetech.com/";   
	    openlaunch(input1);
	    	    
	    wait1();
	    	    
	    Object[]input2=new Object[2];
	   input2[0]="//*[@id='txtuId']"; 
	    input2[1]="Admin";
	    enteruser(input2);//enter username
	    
	    Object[]input3=new Object[2];
	    input3[0]="//*[@id='txtPword']";  
	   input3[1]="Admin";//enter password
	   enteruser(input3);
	    
	    Object[]input4=new Object[1];
	    input4[0]="//*[@id='login']";
	    clickloging(input4);
	    
	    Object[]input5=new Object[1];
	    input5[0]="(//*[@height='24'])[2]";
	    clickloging(input5);
	    
	    Object[]input6=new Object[1];
	    input6[0]="//*[@id='lst_countryS']";
	    clickloging(input6);
	    
	    Object[]input7=new Object[2];
	    input7[0]="//*[@id='lst_countryS']";
	    input7[1]="INDIA";
	    clickoncoun(input7);
	    
	    Object[]input8=new Object[1];
	    input8[0]="//*[@id='lst_stateS']";
	    clickloging(input8);
	      
	    Object[]input71=new Object[2];
	    input71[0]="//*[@id='lst_stateS']";
	    input71[1]="MAHARASTRA";
	    clickoncoun(input71);
	    
	    Object[]input9=new Object[1];
	    input9[0]="//*[@id='lst_cityS']";
	    clickloging(input9);
	    
	    Object[]input91=new Object[2];
	    input91[0]="//*[@id='lst_cityS']";
	    input91[1]="MUMBAI";
	    clickoncoun(input91);
	    
	    Object[]input10=new Object[1];
	    input10[0]="//*[@id='btn_search']";
	    clickloging(input10);
}
}
