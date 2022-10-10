package Nextgen;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
    private WebDriver ldriver;
    
    public Browser(WebDriver driver) {
    	ldriver= driver;
    	
    }
    
    public void setupbrowser(String browser) throws Exception {
    	if(browser.equalsIgnoreCase("chrome")) {
    		WebDriverManager.chromedriver().setup();
    		ldriver = new ChromeDriver();
    		
    		//ldriver.get("https://nxtgenaiacademy.com/demo-site/");
    	}
    	else if(browser.equalsIgnoreCase("edge")) {
    		WebDriverManager.edgedriver().setup();
    		ldriver = new EdgeDriver();
    		
    		//ldriver.get("https://nxtgenaiacademy.com/demo-site/");
    	}
    	else{throw new Exception ("Browser is not correct");}
    }
    
    public void setupsite(String url) throws Exception{
    	ldriver.get(url);
    }
    
	
   
    
    public String propertyReader(String path, String key) throws IOException {
		Properties pro = new Properties();
		FileInputStream loc = new FileInputStream(path);
		pro.load(loc);
		String value = pro.getProperty(key);
		return value;
	
	}

}
